package com.tuce360.etuce;

import java.util.ArrayList;
import java.util.List;

public class Travels {

  public static final List<Data> IMG_DESCRIPTIONS = new ArrayList<Data>();

  static {
	 for(int i=1;i<=49;i++){
		 Travels.IMG_DESCRIPTIONS.add(new Travels.Data(i+".jpg"));
	 }
  }

  public static final class Data {
    public final String imageFilename;

    private Data(String imageFilename) {
      this.imageFilename = imageFilename;

    }
  }
}
