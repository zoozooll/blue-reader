/**
 * added at 下午4:44:45 2013-8-22
 */
package com.mouselee.bluereader.bo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;

import com.mouselee.bluereader.vo.Book;

/**
 * Control scanning of file in disk.
 * 
 * @author Aaron Lee
 * @Date 下午4:44:45 2013-8-22
 */
public class ScanFileController {

	public List<Book> scanDirector(String scanRoot) {
		List<Book> list = null;
		return list;
	}

	private void traverseDir(File dir, List<Book> list) {

		if (!dir.isDirectory() || dir.isHidden()) {
			return;
		}
		File[] children = dir.listFiles();
		if (children == null) {
			return;
		}

		for (File f : children) {
			if (f.isDirectory()) {
				// if it is directory ,call call the method itself and scan the
				// children files.
				traverseDir(dir, list);
			} else {
				// if it is file scan it and put into list.

			}
			
		}

	}

}