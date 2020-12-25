package com.learning.commonsIo;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.EmptyFileFilter;

import java.io.File;
import java.util.Collection;

/**
 * @Auther:yinzhen
 * @Date:2020/12/19 9:12
 * @Description:com.learning.commonsIo
 * @version: 1.0
 */
public class CommonsIOTest {
    public static void main(String[] args) {
        long length = FileUtils.sizeOf(new File("baidu.html"));
        System.out.println(length);
        Collection<File> files = FileUtils.listFiles(new File("c:"), EmptyFileFilter.NOT_EMPTY, null);
        for (File file:files){
            System.out.println(file.getAbsolutePath());
        }
    }
}
