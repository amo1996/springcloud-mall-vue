/**
 * 写原生js可以在vm外面写
 * @type {*|Vue}
 */


var vm=new Vue({
    el:"#vm",   //绑定页面body下面的的div元素id属性
    data:{
     // 定义双向绑定的数据 

    },
    /**
     * mounted   初始化区域，可以在里面调用自定义的方法 页面加载后运行 this.test();
     */
    mounted: function () {
    this.test();
        },
    /**
     * methods 是自定义的js方法
     * 可以用:     方法名:function(val){};     推荐用这种 不报错
     * 也可以用:    方法名(){}; 这种方式需要vue的扩展包 不然js会报错 但是不影响运行。
     */
    methods:{
         test:function () {
             Vue.http.get('http://localhost:8501/provider-user/hello?name=lz'
             ).then(function (response) {
                 alert(response.data);
                  console.log(response);
             }).catch(function (error) {
                 console.log(error);
             });
             console.log("test");
         },
    },
})