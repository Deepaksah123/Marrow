package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class setClearMediaItemsOnStop implements FrameworkMediaDrmExternalSyntheticLambda3<String> {
    private final setDescriptionList<Context> read;

    private setClearMediaItemsOnStop(setDescriptionList<Context> setdescriptionlist) {
        this.read = setdescriptionlist;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public String get() {
        return write(this.read.get());
    }

    public static setClearMediaItemsOnStop RemoteActionCompatParcelizer(setDescriptionList<Context> setdescriptionlist) {
        return new setClearMediaItemsOnStop(setdescriptionlist);
    }

    private static String write(Context context) {
        return (String) executePost.IconCompatParcelizer(invalidateMediaSessionPlaybackState.read(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
