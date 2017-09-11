<template>
	<div>
		<div class="WQ-flex login_head">
		<p class="login_head_left">
			<i class="fa fa-angle-left"></i>
		</p>
		<p>登录</p>
		<i></i>
	</div>
	<p style="height: 1.5rem;"></p>
	<div class="login_content">
		<div class="WQ-flex login_content_item">
			<i class="fa fa-user"></i>
			<input type="text" name="" class="login_content_input" placeholder="账号" v-model="name">
		</div>
		<div class="WQ-flex login_content_item">
			<i class="fa fa-lock"></i>
			<input type="text" name="" class="login_content_input" v-model="passWord" placeholder="密码" >
		</div>
		<div class="login_content_item login_content_submit" @click="submit">
			登录1
		</div>
	</div>
</div>	
</template>
<script>
    export default{
    	  name: 'hello',
          data () {
          return {
          	name:"",
          	passWord:""
          }
        },
        computed:{
        	
        },
        methods:{
        	submit(){
        		
        	}
        }
    }
</script>
<style scoped>
	
	 	.login_head{
		border: 1px solid #f00;
		font-size: 0.4rem;
		height: 0.88rem;
		justify-content:space-between;
		align-items:center;
		background: #ff6565;
		color: #fff;
	 	}
	 	.login_head_left{
	 		width:0.3rem;
	 		text-align: center;
	 	}
	 	.login_content{
	 		font-size:0.4rem;
	 		justify-content: center;
	 		align-items: center;
	 	}
	 	.login_content_item{
	 		width:6.7rem;
	 		height: 0.8rem;
	 		justify-content: center;
	 		align-items: center;
	 		border-radius: 0.4rem;
	 		border:1px solid #d2d2d2;
	 		padding-left: 0.2rem;
	 		margin-left:0.3rem;
	 		margin-bottom: 1rem;
	 		line-height: 0.8rem;
	 	}
	 	.login_content_input{
	 		height:0.7rem;
	 		width:5.5rem;
	 		outline:none;
	 		font-size:0.3rem;
	 		margin-left:15px;
	 	}
	 	.login_content_submit{
	 		background: #ff6565;
		    color: #fff;
		    font-size:30px;
		    text-align: center;
	 	}
</style>