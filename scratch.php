<?php
// Class definition
class greeting{
    // properties
    public $str = "Hello World!";
    
    // methods
    function show_greeting(){
        return $this->str;
    }
}
 
// Create object from class
$message = new greeting;
//$msg = var_dump($message);
$msg2 = $message->show_greeting();
echo $msg2;
?>