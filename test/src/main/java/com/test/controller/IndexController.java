package com.test.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;




@Controller
@Slf4j
public class IndexController {
	
	@RequestMapping("/index")
	public String index() {
		log.info("서버접속");
		
		return "index";
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public void upload(MultipartFile uploadfile) {
		log.info("###upload() POST 호출");
		log.info("파일이름 : ", uploadfile.getOriginalFilename());
		log.info("파일 크기: ", uploadfile.getSize());
		
		saveFile(uploadfile);
	}
	private String saveFile(MultipartFile file) {
		File saveFile = new File(UPLOAD_PATH);
		
		try {
			file.transferTo(saveFile);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
		return saveFile;
		
	}
	
	private static final String UPLOAD_PATH = "C:\\develop\\workspace\\upload";
	
	}
