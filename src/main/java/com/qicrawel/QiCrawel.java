package com.qicrawel;

import java.beans.FeatureDescriptor;
import java.util.ArrayList;

import com.qicrawel.fetch.IBaseFetch;

public class QiCrawel {

	public QiCrawel() {

	}

	public void start(String[] args) {

		ArrayList<String> ipList = fetch.onFetch(seeds);

		for (int i = 0; i < ipList.size(); i++) {

		}

	}

	String[] seeds = new String[] { "http://cl.clus.pw/index.php" };

	IBaseFetch fetch;

	public static void main(String[] args) {

		new QiCrawel().start(args);

	}

	public IBaseFetch getFetch() {
		return fetch;
	}

	public void setFetch(IBaseFetch fetch) {
		this.fetch = fetch;
	}

}
