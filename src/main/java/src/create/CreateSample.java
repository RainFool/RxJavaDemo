package src.create;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import src.ISample;

import java.util.concurrent.Callable;

public class CreateSample implements ISample {

    public CreateSample() {

    }

    @Override
    public void excute(String... params) {
        sampleCreate();
    }

    private void sampleCreate() {
        Flowable.just("Hello world").subscribe(System.out::println);
        Flowable.fromCallable(() -> "from callable")
                .subscribe(System.out::println);
    }
}
