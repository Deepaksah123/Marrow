package kotlin;

import kotlin.Metadata;
import kotlin.getNameArray;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\"\b\u0002\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0014\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u001e\u0010\u001f\u001a\u00020\n2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030!2\b\u0010\u0011\u001a\u0004\u0018\u00010\"H\u0014J\r\u0010#\u001a\u00020\u000eH\u0010¢\u0006\u0002\b$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f¨\u0006%"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "onUndeliveredElement", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "Lkotlin/Function1;", "", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "isConflatedDropOldest", "", "()Z", "send", "element", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySendImpl", "isSendOp", "trySendImpl-Mj0NB7M", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "trySendDropLatest", "trySendDropLatest-Mj0NB7M", "registerSelectForSend", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "", "shouldSendSuspend", "shouldSendSuspend$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class setFirstName<E> extends setAddressLine3<E> {
    private final setAddressLine2 AudioAttributesCompatParcelizer;
    private final int write;

    public setFirstName(int i, setAddressLine2 setaddressline2, getAnswerMap<? super E, getShowPopup> getanswermap) {
        super(i, getanswermap);
        this.write = i;
        this.AudioAttributesCompatParcelizer = setaddressline2;
        if (setaddressline2 == setAddressLine2.read) {
            StringBuilder sb = new StringBuilder("This implementation does not support suspension for senders, use ");
            sb.append(toMagicModuleMetaDataUcModel.write(setAddressLine3.class).AudioAttributesImplApi26Parcelizer());
            sb.append(" instead");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i > 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Buffered channel capacity must be at least 1, but ");
        sb2.append(i);
        sb2.append(" was specified");
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    @Override // kotlin.setAddressLine3
    protected final boolean AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer == setAddressLine2.AudioAttributesCompatParcelizer;
    }

    private static /* synthetic */ <E> Object RemoteActionCompatParcelizer(setFirstName<E> setfirstname, E e) throws Throwable {
        VideoSubtitle videoSubtitleAudioAttributesCompatParcelizer;
        Object objIconCompatParcelizer = setfirstname.IconCompatParcelizer((Object) e, true);
        if (objIconCompatParcelizer instanceof getNameArray.AudioAttributesCompatParcelizer) {
            getNameArray.read(objIconCompatParcelizer);
            getAnswerMap<E, getShowPopup> getanswermap = setfirstname.IconCompatParcelizer;
            if (getanswermap != null && (videoSubtitleAudioAttributesCompatParcelizer = setSelectedUrlIndex.AudioAttributesCompatParcelizer((getAnswerMap<? super Object, getShowPopup>) getanswermap, e, (VideoSubtitle) null)) != null) {
                getPlanName.IconCompatParcelizer(videoSubtitleAudioAttributesCompatParcelizer, setfirstname.IconCompatParcelizer());
                throw videoSubtitleAudioAttributesCompatParcelizer;
            }
            throw setfirstname.IconCompatParcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setAddressLine3, kotlin.UserConfigSerializer
    public final Object read(E e) {
        return IconCompatParcelizer((Object) e, false);
    }

    private final Object IconCompatParcelizer(E e, boolean z) {
        return this.AudioAttributesCompatParcelizer == setAddressLine2.IconCompatParcelizer ? RemoteActionCompatParcelizer(e, z) : write(e);
    }

    private final Object RemoteActionCompatParcelizer(E e, boolean z) {
        getAnswerMap<E, getShowPopup> getanswermap;
        VideoSubtitle videoSubtitleAudioAttributesCompatParcelizer;
        Object obj = super.read(e);
        if (getNameArray.MediaBrowserCompatCustomActionResultReceiver(obj) || getNameArray.IconCompatParcelizer(obj)) {
            return obj;
        }
        if (z && (getanswermap = this.IconCompatParcelizer) != null && (videoSubtitleAudioAttributesCompatParcelizer = setSelectedUrlIndex.AudioAttributesCompatParcelizer((getAnswerMap<? super Object, getShowPopup>) getanswermap, e, (VideoSubtitle) null)) != null) {
            throw videoSubtitleAudioAttributesCompatParcelizer;
        }
        getNameArray.Companion companion = getNameArray.INSTANCE;
        return getNameArray.Companion.read(getShowPopup.INSTANCE);
    }

    @Override // kotlin.setAddressLine3, kotlin.UserConfigSerializer
    public final Object RemoteActionCompatParcelizer(E e, SampleVideos<? super getShowPopup> sampleVideos) {
        return RemoteActionCompatParcelizer((setFirstName) this, (Object) e);
    }
}
