package com.mall.web;

import com.mall.dao.GoodsMapper;
import com.mall.entity.Goods;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author 小书包
 * @date 2018/12/16 23:01
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	private GoodsMapper goodsMapper;
	public static final String PATH = "file";

	@RequestMapping("/add")
	public String upload(HttpServletRequest request,
	                     @NonNull Goods goods,
	                     @NonNull @RequestParam("file") MultipartFile file) throws IOException {
		String path = request.getServletContext().getRealPath(PATH);
		File newFile = new File(path, file.getOriginalFilename());
		if (!newFile.getParentFile().exists()) {
			newFile.mkdirs();
		}
		file.transferTo(newFile);
		goods.setImgPath(PATH + File.separator + file.getOriginalFilename());
		goodsMapper.insert(goods);
		return "redirect:/goods/lists";
	}

	@RequestMapping("/lists")
	public String goodsList(Model model) {
		List<Goods> goods = goodsMapper.goodsList();
		model.addAttribute("goods", goods);
		return "/goods/lists";
	}
}
