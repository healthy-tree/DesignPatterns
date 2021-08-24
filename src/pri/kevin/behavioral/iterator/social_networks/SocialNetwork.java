package pri.kevin.behavioral.iterator.social_networks;

import pri.kevin.behavioral.iterator.iterators.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
