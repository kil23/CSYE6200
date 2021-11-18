package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
//		Item.demo();
		Explosion boom = new Explosion();
		boom.explode();
		Grenade nade = new Grenade();
		nade.explode();
		Gunshot shot = new Gunshot();
		shot.explode();
	}

}
