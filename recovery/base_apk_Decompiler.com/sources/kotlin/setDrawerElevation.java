package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/setDrawerElevation;", "Lo/writeReplace;", "<init>", "()V", "Lo/_handleOddName;", "Lo/_skipWSOrEnd;", "p0", "AudioAttributesCompatParcelizer", "(Lo/_handleOddName;Lo/_skipWSOrEnd;)Lo/_handleOddName;", "IconCompatParcelizer", "(Lo/_handleOddName;)Lo/_handleOddName;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setDrawerElevation implements writeReplace {
    public static final setDrawerElevation INSTANCE = new setDrawerElevation();

    /* JADX INFO: renamed from: o.setDrawerElevation$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "read", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            read(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void read(as asVar) {
            asVar.write("matchParentSize");
        }

        public AnonymousClass2() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.setDrawerElevation$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "read", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ _skipWSOrEnd $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            read(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void read(as asVar) {
            asVar.write("align");
            asVar.write(this.$read);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(_skipWSOrEnd _skipwsorend) {
            super(1);
            this.$read = _skipwsorend;
        }
    }

    private setDrawerElevation() {
    }

    @Override // kotlin.writeReplace
    public final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname) {
        return _handleoddname.AudioAttributesCompatParcelizer(new setNestedScrollingEnabled(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), true, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass2() : C0214type.read()));
    }

    @Override // kotlin.writeReplace
    public final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, _skipWSOrEnd _skipwsorend) {
        return _handleoddname.AudioAttributesCompatParcelizer(new setNestedScrollingEnabled(_skipwsorend, false, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass4(_skipwsorend) : C0214type.read()));
    }
}
