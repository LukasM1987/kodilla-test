package com.kodilla.kodillapatterns2.observer.homework;

import com.kodilla.kodillapatterns2.observer.forum.Observer;

public interface TaskObservable {

    void registerObserver(TaskObserver taskObserver);
    void notifyObservers();
    void removeObserver(TaskObserver taskObserver);
}
