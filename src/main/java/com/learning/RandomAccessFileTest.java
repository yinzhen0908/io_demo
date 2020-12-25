package com.learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Auther:yinzhen
 * @Date:2020/12/16 19:22
 * @Description:com.learning
 * @version: 1.0
 */

/**
 * 分块读取文件
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        File file = new File("doc.txt");
        //获取文件有多长
        long length = file.length();
        //规定块大小
        int blockSize = 1024;
        //预估整个文件可能存在多少个块，要进行循环读取，转换被除数为浮点数，除以块大小，
        //再采用向上取整，获取块数
        int size = (int)Math.ceil(length*1.0/blockSize);
        System.out.printf("要被切成《%d》个块\r\n",size);

        //开始读取文件了，应该规定文件从哪个地方开始读取，规定好偏移量
        int beginPos = 0;
        //判断每次到底应该读取多大长度的字符串，或者说读取多少个字节的数据
        //有可能文件都没有一个块的长度，或者很有可能读取到最后一个块的时候，不够一个块的大小
        int actualSize = (int) (blockSize>length?length:blockSize);
        //开始循环读取文件
        for(int i=0;i<size;i++){
            //一个文件是有对应的偏移量的，读下一块的时候，需要给一个起始值，就是beginPos，这个值
            //是要进行改变的,这就是每次读取块的时候的起始偏移量
            beginPos = i*blockSize;
            //如果是最后一块，那么实际读取的块大小就是剩余的长度了，否则实际读取的大小就是块大小,
            //同时，总长度要减去实际读取的长度
            if(i==size-1){
                actualSize=(int) length;
            }else{
                actualSize=blockSize;
                length -= actualSize;
            }
            System.out.printf("%d--->起始位置是%d--->读取的大小是:%d\r\n", i,beginPos,actualSize);

            //该读取实际的数据了
            readSplit(i,beginPos,actualSize);

        }

    }
    //既然是一个循环，就可以当作一个普通的方法
    //参数分别是，读取的块数，开始读取的位置，实际读取的大小
    public static void readSplit(int i,int beginPos,int actualSize){
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(new File("doc.txt"), "r");
            //从指定偏移量开始读数据
            randomAccessFile.seek(beginPos);
            //为了提高读取的效率，增加一个缓冲区的字节数组
            byte[] bytes = new byte[1024];
            //开始读取数据了
            int length=0;
            while ((length=randomAccessFile.read(bytes))!=-1){//这里就是循环读每个块的数据
                System.out.printf("块《%d》内循环读取的长度为:%d\r\n",i,length);
                //actualSize 实际读取的块大小，切文件时，最后那个块非常重要，这个块可能不满足整个块（blockSize）的大小，
                if(actualSize>length){//意味着一个块没有读完，减少块的长度，后续继续读取这个块
                    System.out.println(new String(bytes,0,length));
                    actualSize -= length;
                }else{//意味着不够读，此时可以将剩余的内容一次输出，并且要跳出循环，不能再往下读了，说明当前块已经读完了
                    System.out.println(new String(bytes,0,actualSize));
                    System.out.printf("块《%d》读取完毕\r\n",i);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {//千万别忘记关闭流，因为这个文件本身带着流输入输出，大数据的思想，分而治之
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
