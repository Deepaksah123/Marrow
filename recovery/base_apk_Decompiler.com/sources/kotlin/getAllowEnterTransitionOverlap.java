package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"Lo/_handleOddName;", "Lo/dump;", "p0", "AudioAttributesCompatParcelizer", "(Lo/_handleOddName;Lo/dump;)Lo/_handleOddName;", "RemoteActionCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getAllowEnterTransitionOverlap {

    /* JADX INFO: renamed from: o.getAllowEnterTransitionOverlap$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "write", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ dump $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            write(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void write(as asVar) {
            asVar.write("height");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("intrinsicSize", this.$read);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(dump dumpVar) {
            super(1);
            this.$read = dumpVar;
        }
    }

    /* JADX INFO: renamed from: o.getAllowEnterTransitionOverlap$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "write", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ dump $IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            write(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void write(as asVar) {
            asVar.write("width");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("intrinsicSize", this.$IconCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(dump dumpVar) {
            super(1);
            this.$IconCompatParcelizer = dumpVar;
        }
    }

    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, dump dumpVar) {
        return _handleoddname.AudioAttributesCompatParcelizer(new getEnterAnim(dumpVar, true, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass3(dumpVar) : C0214type.read()));
    }

    public static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, dump dumpVar) {
        return _handleoddname.AudioAttributesCompatParcelizer(new callStartTransitionListener(dumpVar, true, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass1(dumpVar) : C0214type.read()));
    }
}
