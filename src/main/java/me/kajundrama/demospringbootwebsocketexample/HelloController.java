/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package me.kajundrama.demospringbootwebsocketexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *   Hello를 출력하는 컨트롤러 클래스
 * </pre>
 */
@RestController
public class HelloController {


  /**
   *
   * @return Hello를 출력한다
   */
  @GetMapping("/hello")
  public String hello() {
    return "Hello";
  }
}
