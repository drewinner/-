<?php 
interface Api {
	public function operation($s);
}

class ImplA implements Api {
	public function operation($s){
		echo "ImlA s == $s";
	}
}

class ImplB implements Api {
	public function operation($s){
		echo "ImplB s == $s";
	}
}

class Factory {

	public static function createApi($i=1){
		$a = null;
		if($i == 1){
			$a = new ImplA();
		}else{
			$a = new ImplB();
		}
		return $a;
	}
}

$api = Factory::createApi(1);
$api->operation("implA");