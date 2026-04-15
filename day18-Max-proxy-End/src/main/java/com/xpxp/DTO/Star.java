package com.xpxp.DTO;


import com.xpxp.Service.StarService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Star
 * @date 2026/04/15  22:27
 * @email thexpxp233@qq.com
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Star implements StarService {
    private String name;

    @Override
    public void sing(String name) {
        System.out.println(this.name + "表演唱歌:" + name);
    }

    @Override
    public String dance() {
        System.out.println(this.name + "表演跳舞:魅力四射");
        return "谢谢";
    }
}
