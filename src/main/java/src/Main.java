package src;

import io.reactivex.Observable;
import src.create.CreateSample;

public class Main {
    public static final void main(String[] args) {
        System.out.println("--------main----------");
        CreateSample createSample = new CreateSample();
        createSample.excute();
    }
}
