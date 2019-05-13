


var vm=new Vue({
    el:"#vm",
    data:{

    },
    mounted: function () {
    this.test();

        },
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