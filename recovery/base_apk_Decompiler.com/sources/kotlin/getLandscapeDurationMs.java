package kotlin;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0094@¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/getLandscapeDurationMs;", "T", "Lo/getDidReBuffer;", "", "Lo/NewNumberOtpResendRequest;", "p0", "Lo/CurrentQuery;", "p1", "", "p2", "Lo/setAddressLine2;", "p3", "<init>", "(Ljava/lang/Iterable;Lo/CurrentQuery;ILo/setAddressLine2;)V", "AudioAttributesCompatParcelizer", "(Lo/CurrentQuery;ILo/setAddressLine2;)Lo/getDidReBuffer;", "Lo/TopUserCompanion;", "Lo/setLastName;", "IconCompatParcelizer", "(Lo/TopUserCompanion;)Lo/setLastName;", "Lo/getShowPearlDeletionPopup;", "", "read", "(Lo/getShowPearlDeletionPopup;Lo/SampleVideos;)Ljava/lang/Object;", "write", "Ljava/lang/Iterable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getLandscapeDurationMs<T> extends getDidReBuffer<T> {
    private final Iterable<NewNumberOtpResendRequest<T>> write;

    public /* synthetic */ getLandscapeDurationMs(Iterable iterable, VideoSessionResponseBody videoSessionResponseBody, int i, setAddressLine2 setaddressline2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(iterable, (i2 & 2) != 0 ? VideoSessionResponseBody.RemoteActionCompatParcelizer : videoSessionResponseBody, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? setAddressLine2.read : setaddressline2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private getLandscapeDurationMs(Iterable<? extends NewNumberOtpResendRequest<? extends T>> iterable, CurrentQuery currentQuery, int i, setAddressLine2 setaddressline2) {
        super(currentQuery, i, setaddressline2);
        this.write = iterable;
    }

    @Override // kotlin.getDidReBuffer
    protected final getDidReBuffer<T> AudioAttributesCompatParcelizer(CurrentQuery p0, int p1, setAddressLine2 p2) {
        return new getLandscapeDurationMs(this.write, p0, p1, p2);
    }

    @Override // kotlin.getDidReBuffer
    public final setLastName<T> IconCompatParcelizer(TopUserCompanion p0) {
        return UserConfigResponse.write(p0, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, RemoteActionCompatParcelizer());
    }

    @Override // kotlin.getDidReBuffer
    protected final Object read(getShowPearlDeletionPopup<? super T> getshowpearldeletionpopup, SampleVideos<? super getShowPopup> sampleVideos) {
        getTotalFramesDropped gettotalframesdropped = new getTotalFramesDropped(getshowpearldeletionpopup);
        Iterator<NewNumberOtpResendRequest<T>> it = this.write.iterator();
        while (it.hasNext()) {
            C0201setMcqCount.IconCompatParcelizer(getshowpearldeletionpopup, null, null, new IconCompatParcelizer(it.next(), gettotalframesdropped, null), 3);
        }
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ getTotalFramesDropped<T> AudioAttributesCompatParcelizer;
        private int read;
        private /* synthetic */ NewNumberOtpResendRequest<T> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (this.write.write(this.AudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, getTotalFramesDropped<T> gettotalframesdropped, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = newNumberOtpResendRequest;
            this.AudioAttributesCompatParcelizer = gettotalframesdropped;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.write, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }
}
