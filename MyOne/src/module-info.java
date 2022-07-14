import demo03.Czxy;
import demo03.MyServer;

module MyOne {
	exports demo01;
	exports demo03;
	provides MyServer with Czxy; 
}