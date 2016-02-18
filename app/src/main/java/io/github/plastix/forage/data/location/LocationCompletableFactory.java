package io.github.plastix.forage.data.location;

import javax.inject.Inject;
import javax.inject.Provider;

import rx.Completable;

public class LocationCompletableFactory {

    private Provider<LocationCompletableOnSubscribe> completableOnSubscribeProvider;

    @Inject
    public LocationCompletableFactory(Provider<LocationCompletableOnSubscribe> completableOnSubscribeProvider) {
        this.completableOnSubscribeProvider = completableOnSubscribeProvider;
    }

    public Completable buldLocationCompletable() {
        return Completable.create(completableOnSubscribeProvider.get());
    }
}
