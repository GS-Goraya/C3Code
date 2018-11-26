package com.jlcindia.spring.mvc;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.method.annotation.ModelAndViewMethodReturnValueHandler;
@Controller
public class FileUploadController {
	
	@RequestMapping(value="/uploadfile.jlc",method=RequestMethod.POST)
	public String uploadFile(@RequestParam("name")String name,@RequestParam("file")MultipartFile file, HttpServletRequest req)

	{
		if(file.isEmpty())
		{	req.setAttribute("MSG",file.getOriginalFilename()+"is empty");
		return "error";
		}
		else
		{
			
			try
			{
				File dir=new File("E:/Files");
				if(!dir.exists())
				dir.mkdirs();
				String fileName=name+".jpg" ;
				File f=new File(dir,fileName);
				BufferedOutputStream stream=new BufferedOutputStream(new FileOutputStream(f));
				byte data[]=file.getBytes();
				stream.write(data);
				stream.close();
				req.setAttribute("MSG", f.getAbsolutePath());
				return "success";
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				req.setAttribute("MSG", file.getOriginalFilename()+"."+e.getMessage());
			return "error";
			}
		}
	}
	
		
	
}

