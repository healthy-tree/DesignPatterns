package pri.kevin.behavioral.iterator.iterators;

import pri.kevin.behavioral.iterator.profile.Profile;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}
