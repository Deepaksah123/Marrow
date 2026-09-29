package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\f\u0010\nR\u001c\u0010\t\u001a\u00020\r8\u0000@\u0001X\u0080\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013\"\u0004\b\u0010\u0010\u0014R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\"\u0004\b\u000e\u0010\u0017R$\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\t\u0010\u001a\"\u0004\b\f\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\t\u0010\u001dR\u0011\u0010 \u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001fR\u0014\u0010#\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\"R\u0014\u0010$\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\""}, d2 = {"Lo/_reportInvalidChar;", "Lo/bufferMapProperty;", "<init>", "()V", "Lkotlin/Function1;", "Lo/findSetterInfo;", "", "p0", "Lo/parseMediumName;", "write", "(Lo/getAnswerMap;)Lo/parseMediumName;", "Lo/findSerializer;", "IconCompatParcelizer", "Lo/parseName;", "read", "Lo/parseName;", "RemoteActionCompatParcelizer", "(Lo/parseName;)V", "Lo/parseMediumName;", "()Lo/parseMediumName;", "(Lo/parseMediumName;)V", "AudioAttributesCompatParcelizer", "Lo/findSerializer;", "(Lo/findSerializer;)V", "Lkotlin/Function0;", "Lo/buf;", "Lo/getCreatedOnDateMs;", "(Lo/getCreatedOnDateMs;)V", "Lo/calloc;", "()J", "Lo/tryToResolveUnresolved;", "()Lo/tryToResolveUnresolved;", "AudioAttributesImplApi21Parcelizer", "", "()F", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _reportInvalidChar implements bufferMapProperty {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private findSerializer IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private parseMediumName read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private parseName write = _allocateEntityBuffer.INSTANCE;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private getCreatedOnDateMs<? extends buf> RemoteActionCompatParcelizer;

    public final void RemoteActionCompatParcelizer(parseName parsename) {
        this.write = parsename;
    }

    public final void RemoteActionCompatParcelizer(parseMediumName parsemediumname) {
        this.read = parsemediumname;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final parseMediumName getRead() {
        return this.read;
    }

    public final void read(findSerializer findserializer) {
        this.IconCompatParcelizer = findserializer;
    }

    public final void IconCompatParcelizer(getCreatedOnDateMs<? extends buf> getcreatedondatems) {
        this.RemoteActionCompatParcelizer = getcreatedondatems;
    }

    public final long write() {
        return this.write.AudioAttributesImplApi21Parcelizer();
    }

    public final tryToResolveUnresolved RemoteActionCompatParcelizer() {
        return this.write.write();
    }

    /* JADX INFO: renamed from: o._reportInvalidChar$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/findSerializer;", "", "read", "(Lo/findSerializer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<findSerializer, getShowPopup> {
        final /* synthetic */ getAnswerMap<findSetterInfo, getShowPopup> $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(findSerializer findserializer) {
            read(findserializer);
            return getShowPopup.INSTANCE;
        }

        public final void read(findSerializer findserializer) {
            this.$write.invoke(findserializer);
            findserializer.write();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(getAnswerMap<? super findSetterInfo, getShowPopup> getanswermap) {
            super(1);
            this.$write = getanswermap;
        }
    }

    public final parseMediumName write(getAnswerMap<? super findSetterInfo, getShowPopup> p0) {
        return IconCompatParcelizer(new AnonymousClass1(p0));
    }

    public final parseMediumName IconCompatParcelizer(getAnswerMap<? super findSerializer, getShowPopup> p0) {
        parseMediumName parsemediumname = new parseMediumName(p0);
        this.read = parsemediumname;
        return parsemediumname;
    }

    @Override // kotlin.bufferMapProperty
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final float getAudioAttributesCompatParcelizer() {
        return this.write.read().getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getParameter
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final float getIconCompatParcelizer() {
        return this.write.read().getIconCompatParcelizer();
    }
}
