package de.htw_berlin.fb4.ossd.prose_builder_test;

import de.htw_berlin.fb4.ossd.prose.Sentence;
import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.example.ExampleSentence;

public class ProseBuilderTest {


    public static void main(String args[]){
        ProseBuilder proseBuilder = new ProseBuilder();
        proseBuilder.register(new ExampleSentence());
        proseBuilder.register(() -> "Haste mal ne Mark!");

        System.out.println(proseBuilder.get());
    }
}
