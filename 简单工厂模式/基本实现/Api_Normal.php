<?php 

interface Api {
	public function test($string);
}


class Impl implements Api {
	public function test($string=""){
		echo $string;
	}
}

function work(Api $api,$str){
	$api->test($str);
}

$api = new Impl();
work($api,"world");