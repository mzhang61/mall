1. use PowerDesigner tool to generate SQL files from data design
2. use renren-generator to generate rest apis - controller, dao, entity, service, and service impl
   // changes in application.yml
   spring:
   datasource:
   type: com.alibaba.druid.pool.DruidDataSource
   driverClassName: com.mysql.cj.jdbc.Driver
   url: jdbc:mysql://192.168.56.10:3306/gulimall_oms?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC
   username: root
   password: root
   
   // changes in generator.properties
   mainPath=com.atguigu

   package=com.atguigu.gulimall
   moduleName=order
   
   author=nickzhang
   
   email=nickzhangcs@gmail.com
   
   tablePrefix=oms_    // this one is database prefix
3. use nacos for services discovery
4. use openFeign to utilize apis
      - add dependency to both modules
      - add feign package and its interface to use api from another module, example
        @FeignClient("gulimall-coupon")
        public interface CouponFeignService {

   @RequestMapping("/coupon/coupon/member/list")
   public R membercoupons();

}
      - add to the main class
         @EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")

5. test uploading configurations to the nacos
6. 