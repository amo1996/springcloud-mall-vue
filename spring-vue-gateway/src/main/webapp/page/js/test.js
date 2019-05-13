


var vm=new Vue({
    el:"#vm",
    data:{

    },
    mounted: function () {
    this.test();

        },
    methods:{
         test:function () {
             Vue.http.get('http://localhost:8501/spring-cloud'
             ).then(function (response) {
                  console.log(response);
             }).catch(function (error) {
                 console.log(error);
             });
             console.log("test");
         },
    },
})