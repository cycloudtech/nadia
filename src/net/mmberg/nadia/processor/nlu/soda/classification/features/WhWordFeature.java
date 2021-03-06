package net.mmberg.nadia.processor.nlu.soda.classification.features;

import java.util.Arrays;
import java.util.HashSet;

public class WhWordFeature extends Feature {

	HashSet<String> whWords=new HashSet<String>(Arrays.asList("where", "when", "why", "who", "what", "whom", "how"));
	
	public WhWordFeature(){
		super("WhWord");
	}

	@Override
	protected boolean hasFeature(String utterance){
		for(String whWord : whWords){
			if (utterance.contains(whWord)) return true;
		}
		return false;
	}

	
}
