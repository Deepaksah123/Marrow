package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class move implements FrameworkMediaDrmExternalSyntheticLambda3<TimelineQueueEditor> {
    private final setDescriptionList<Integer> AudioAttributesCompatParcelizer;
    private final setDescriptionList<Context> RemoteActionCompatParcelizer;
    private final setDescriptionList<String> read;

    private move(setDescriptionList<Context> setdescriptionlist, setDescriptionList<String> setdescriptionlist2, setDescriptionList<Integer> setdescriptionlist3) {
        this.RemoteActionCompatParcelizer = setdescriptionlist;
        this.read = setdescriptionlist2;
        this.AudioAttributesCompatParcelizer = setdescriptionlist3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public TimelineQueueEditor get() {
        return IconCompatParcelizer(this.RemoteActionCompatParcelizer.get(), this.read.get(), this.AudioAttributesCompatParcelizer.get().intValue());
    }

    public static move RemoteActionCompatParcelizer(setDescriptionList<Context> setdescriptionlist, setDescriptionList<String> setdescriptionlist2, setDescriptionList<Integer> setdescriptionlist3) {
        return new move(setdescriptionlist, setdescriptionlist2, setdescriptionlist3);
    }

    private static TimelineQueueEditor IconCompatParcelizer(Context context, String str, int i) {
        return new TimelineQueueEditor(context, str, i);
    }
}
