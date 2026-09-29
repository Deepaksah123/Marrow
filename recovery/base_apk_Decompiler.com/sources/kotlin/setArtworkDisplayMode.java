package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b \u0010!R\u0019\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\""}, d2 = {"Lo/setArtworkDisplayMode;", "Lo/isJavaLangObject;", "Lo/suppressLayout;", "p0", "", "p1", "Lo/withDelegate;", "p2", "Lkotlin/Function0;", "Lo/hasStableIds;", "p3", "<init>", "(Lo/suppressLayout;ILo/withDelegate;Lo/getCreatedOnDateMs;)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "IconCompatParcelizer", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "Lo/suppressLayout;", "read", "I", "RemoteActionCompatParcelizer", "Lo/withDelegate;", "Lo/getCreatedOnDateMs;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class setArtworkDisplayMode implements isJavaLangObject {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<hasStableIds> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final withDelegate IconCompatParcelizer;
    private final int read;
    private final suppressLayout write;

    public setArtworkDisplayMode(suppressLayout suppresslayout, int i, withDelegate withdelegate, getCreatedOnDateMs<hasStableIds> getcreatedondatems) {
        this.write = suppresslayout;
        this.read = i;
        this.IconCompatParcelizer = withdelegate;
        this.RemoteActionCompatParcelizer = getcreatedondatems;
    }

    @Override // kotlin.isJavaLangObject
    public final withHandlersFrom IconCompatParcelizer(final withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        final _parser _parserVarWrite = istypeorsupertypeof.write(istypeorsupertypeof.write(PropertyValueAny.AudioAttributesImplApi21Parcelizer(j)) < PropertyValueAny.AudioAttributesImplBaseParcelizer(j) ? j : PropertyValueAny.AudioAttributesCompatParcelizer$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        final int iMin = Math.min(_parserVarWrite.getRead(), PropertyValueAny.AudioAttributesImplBaseParcelizer(j));
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, iMin, _parserVarWrite.getRemoteActionCompatParcelizer(), null, new getAnswerMap() { // from class: o.performClick
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setArtworkDisplayMode.write(this.IconCompatParcelizer, withcontentvaluehandler, _parserVarWrite, iMin, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(setArtworkDisplayMode setartworkdisplaymode, withContentValueHandler withcontentvaluehandler, _parser _parserVar, int i, _parser.IconCompatParcelizer iconCompatParcelizer) {
        _parser.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
        int i2 = setartworkdisplaymode.read;
        withDelegate withdelegate = setartworkdisplaymode.IconCompatParcelizer;
        hasStableIds hasstableidsInvoke = setartworkdisplaymode.RemoteActionCompatParcelizer.invoke();
        setartworkdisplaymode.write.write(superDispatchKeyEvent.AudioAttributesCompatParcelizer, setOnFlingListener.IconCompatParcelizer(iconCompatParcelizer2, i2, withdelegate, hasstableidsInvoke != null ? hasstableidsInvoke.getAudioAttributesCompatParcelizer() : null, withcontentvaluehandler.getAudioAttributesCompatParcelizer() == tryToResolveUnresolved.RemoteActionCompatParcelizer, _parserVar.getRead()), i, _parserVar.getRead());
        _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, Math.round(-setartworkdisplaymode.write.RemoteActionCompatParcelizer()), 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        return getShowPopup.INSTANCE;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setArtworkDisplayMode)) {
            return false;
        }
        setArtworkDisplayMode setartworkdisplaymode = (setArtworkDisplayMode) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, setartworkdisplaymode.write) && this.read == setartworkdisplaymode.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, setartworkdisplaymode.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, setartworkdisplaymode.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((((this.write.hashCode() * 31) + Integer.hashCode(this.read)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("setArtworkDisplayMode(write=");
        sb.append(this.write);
        sb.append(", read=");
        sb.append(this.read);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
