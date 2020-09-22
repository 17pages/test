package com.test.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;



@RequestMapping("/")
@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@Controller
	public class FileAction {
	    private static final String SAVE_PATH = "C:\\develop\\workspace";
	 
 
	    @RequestMapping("upload")
	    public ModelAndView upload(@RequestParam(value="fasta_file", required = false) MultipartFile mf) {
	            ModelAndView mv = new ModelAndView("index");        
	 	 
	            String originalFileName = mf.getOriginalFilename(); //업로드한 파일의 실제 이름
	            long fileSize = mf.getSize(); //업로드할 파일의 실제 이름을 반환
	            String safeFile = SAVE_PATH + System.currentTimeMillis() + originalFileName; //save_path 경로+현재시간+실제파일이름
	 	            
	            try {
	                mf.transferTo(new File(safeFile));//save_path 경로에 실제파일이 생겨남
	 
	               } catch (IllegalStateException e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                } catch (IOException e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	            return mv;
	    } 
	   }
	}
