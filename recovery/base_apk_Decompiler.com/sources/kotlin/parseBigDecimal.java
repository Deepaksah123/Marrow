package kotlin;

import kotlin.FastIntegerMath1;
import kotlin.Metadata;
import kotlin.parseBigDecimal;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0014"}, d2 = {"Lo/parseBigDecimal;", "", "Lkotlin/Function0;", "", "p0", "<init>", "(Lo/getCreatedOnDateMs;)V", "Lo/_contentReference;", "read", "(Lo/getCreatedOnDateMs;)Lo/_contentReference;", "RemoteActionCompatParcelizer", "()V", "Lo/fillPowersOf10Floor16;", "Lo/splitFloor16;", "IconCompatParcelizer", "Lo/FastIntegerMath1;", "Lo/parseBigDecimal$RemoteActionCompatParcelizer;", "Lo/FastIntegerMath1;", "Lo/getCreatedOnDateMs;", "", "()Z", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class parseBigDecimal {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final splitFloor16 IconCompatParcelizer = fillPowersOf10Floor16.read(false);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final FastIntegerMath1<RemoteActionCompatParcelizer> read = new FastIntegerMath1<>();

    public parseBigDecimal(final getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.RemoteActionCompatParcelizer = new getCreatedOnDateMs() { // from class: o.BigDecimalParser
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return parseBigDecimal.write(this.IconCompatParcelizer, getcreatedondatems);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(parseBigDecimal parsebigdecimal, getCreatedOnDateMs getcreatedondatems) {
        if (!fillPowersOf10Floor16.write(parsebigdecimal.IconCompatParcelizer)) {
            getcreatedondatems.invoke();
        }
        return getShowPopup.INSTANCE;
    }

    public final boolean read() {
        return this.read.RemoteActionCompatParcelizer();
    }

    public final _contentReference read(getCreatedOnDateMs<getShowPopup> p0) {
        return this.read.write(new RemoteActionCompatParcelizer(p0), this.RemoteActionCompatParcelizer);
    }

    public final void RemoteActionCompatParcelizer() {
        fillPowersOf10Floor16.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, false);
        this.read.IconCompatParcelizer(new getAnswerMap() { // from class: o.adjustScale
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return parseBigDecimal.read((parseBigDecimal.RemoteActionCompatParcelizer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\t\u0010\u000bR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lo/parseBigDecimal$RemoteActionCompatParcelizer;", "Lo/FastIntegerMath1$IconCompatParcelizer;", "Lkotlin/Function0;", "", "p0", "<init>", "(Lo/getCreatedOnDateMs;)V", "AudioAttributesCompatParcelizer", "()V", "RemoteActionCompatParcelizer", "", "(Ljava/lang/Throwable;)V", "write", "Lo/getCreatedOnDateMs;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends FastIntegerMath1.IconCompatParcelizer {

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private getCreatedOnDateMs<getShowPopup> read;

        public RemoteActionCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.read = getcreatedondatems;
        }

        @Override // o.FastIntegerMath1.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            this.read = null;
        }

        public final void RemoteActionCompatParcelizer() {
            getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.read;
            if (getcreatedondatems != null) {
                getcreatedondatems.invoke();
            }
        }

        @Override // o.FastIntegerMath1.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer(Throwable p0) throws Throwable {
            throw p0;
        }
    }
}
