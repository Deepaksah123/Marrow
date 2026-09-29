package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class RecentUpdatesModel extends isUploaded {
    private final getFeaturedCards IconCompatParcelizer;
    private final setStartTimeStamp RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentUpdatesModel(getFeaturedCards getfeaturedcards, setStartTimeStamp setstarttimestamp, int i, getVariant getvariant) {
        super(getfeaturedcards.read(), getvariant, new HomeCardModel(getfeaturedcards, setstarttimestamp), setstarttimestamp.RatingCompat(), getTotalSubject.INVARIANT, false, i, getIntroDurationSeconds.AudioAttributesCompatParcelizer, getfeaturedcards.IconCompatParcelizer().onMediaButtonEvent());
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(setstarttimestamp, "");
        toMagicModuleMetaRepoModel.write(getvariant, "");
        this.IconCompatParcelizer = getfeaturedcards;
        this.RemoteActionCompatParcelizer = setstarttimestamp;
    }

    @Override // kotlin.AbstractC0174getFilename
    public final List<getLink> onAddQueueItem() {
        return handleMediaPlayPauseIfPendingOnHandler();
    }

    private final List<getLink> handleMediaPlayPauseIfPendingOnHandler() {
        Collection<QbankSubModel> collectionWrite = this.RemoteActionCompatParcelizer.write();
        if (collectionWrite.isEmpty()) {
            getHref gethrefWrite = this.IconCompatParcelizer.write().write().write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefWrite, "");
            getHref gethrefOnCommand = this.IconCompatParcelizer.write().write().onCommand();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefOnCommand, "");
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(AddOnMetaKt.AudioAttributesCompatParcelizer(gethrefWrite, gethrefOnCommand));
        }
        Collection<QbankSubModel> collection = collectionWrite;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer().read((QbankSubModel) it.next(), getPublishedOnMs.read(setGroupSubttile.COMMON, false, false, this, 3)));
        }
        return arrayList;
    }

    @Override // kotlin.AbstractC0174getFilename
    public final List<getLink> read(List<? extends getLink> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        return this.IconCompatParcelizer.IconCompatParcelizer().onCommand().AudioAttributesCompatParcelizer(this, list, this.IconCompatParcelizer);
    }

    @Override // kotlin.AbstractC0174getFilename
    public final void RemoteActionCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
    }
}
