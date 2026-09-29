package kotlin;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.WindowInsetsCompatImpl30;
import kotlin._parser;
import kotlin.isCancelable;
import kotlin.onDismiss;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001a\u001a\u00020\u0019*\u00020\u00152\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00162\u0006\u0010\u0006\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001e\u001a\u00020\u000e*\u00020\u001c2\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00160\u00162\u0006\u0010\u0006\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\u001a\u001a\u00020\u000e*\u00020\u001c2\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00160\u00162\u0006\u0010\u0006\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001fJ/\u0010 \u001a\u00020\u000e*\u00020\u001c2\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00160\u00162\u0006\u0010\u0006\u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u001fJ/\u0010!\u001a\u00020\u000e*\u00020\u001c2\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00160\u00162\u0006\u0010\u0006\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u001fJK\u0010!\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00162\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J+\u0010#\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00162\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e¢\u0006\u0004\b#\u0010$JK\u0010\u001e\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00162\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\"J\u0019\u0010#\u001a\u00020\u000e*\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b#\u0010%J\u0019\u0010 \u001a\u00020\u000e*\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b \u0010%J\u0019\u0010!\u001a\u00020\u000e*\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b!\u0010%J\u001a\u0010'\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-R\u001a\u0010 \u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b\u001e\u0010/R\u001a\u0010#\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\b!\u00101R\u001a\u0010!\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b \u00104R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u00105R\u001a\u0010\u001e\u001a\u00020\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u00106\u001a\u0004\b#\u00107R\u0014\u00108\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u00105R\u0014\u00109\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u00102\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u0010:R\u0014\u0010;\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<"}, d2 = {"Lo/requireComponentDialog;", "Lo/findBackReference;", "Lo/onStart;", "", "p0", "Lo/WindowInsetsCompatImpl30$write;", "p1", "Lo/WindowInsetsCompatImpl30$RatingCompat;", "p2", "Lo/assignParameter;", "p3", "Lo/BackStackState;", "p4", "p5", "", "p6", "p7", "Lo/onGetLayoutInflater;", "p8", "<init>", "(ZLo/WindowInsetsCompatImpl30$write;Lo/WindowInsetsCompatImpl30$RatingCompat;FLo/BackStackState;FIILo/onGetLayoutInflater;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "IconCompatParcelizer", "(Lo/getValueHandler;Ljava/util/List;I)I", "AudioAttributesCompatParcelizer", "write", "(Ljava/util/List;IIIIILo/onGetLayoutInflater;)I", "RemoteActionCompatParcelizer", "(Ljava/util/List;II)I", "(Lo/hasHandlers;I)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "()Z", "Lo/WindowInsetsCompatImpl30$write;", "()Lo/WindowInsetsCompatImpl30$write;", "MediaBrowserCompatItemReceiver", "Lo/WindowInsetsCompatImpl30$RatingCompat;", "()Lo/WindowInsetsCompatImpl30$RatingCompat;", "F", "Lo/BackStackState;", "()Lo/BackStackState;", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "I", "AudioAttributesImplBaseParcelizer", "Lo/onGetLayoutInflater;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class requireComponentDialog implements findBackReference, onStart {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;
    private final onGetLayoutInflater AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float read;
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final WindowInsetsCompatImpl30.RatingCompat write;
    private final WindowInsetsCompatImpl30.write RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final BackStackState IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    private requireComponentDialog(boolean z, WindowInsetsCompatImpl30.write writeVar, WindowInsetsCompatImpl30.RatingCompat ratingCompat, float f, BackStackState backStackState, float f2, int i, int i2, onGetLayoutInflater ongetlayoutinflater) {
        this.AudioAttributesCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = writeVar;
        this.write = ratingCompat;
        this.read = f;
        this.IconCompatParcelizer = backStackState;
        this.AudioAttributesImplApi21Parcelizer = f2;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.MediaBrowserCompatItemReceiver = i2;
        this.AudioAttributesImplBaseParcelizer = ongetlayoutinflater;
    }

    @Override // kotlin.onStart
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.onStart
    /* JADX INFO: renamed from: write, reason: from getter */
    public final WindowInsetsCompatImpl30.write getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.onStart
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final WindowInsetsCompatImpl30.RatingCompat getWrite() {
        return this.write;
    }

    @Override // kotlin.onStart
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final BackStackState getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.findBackReference
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, List<? extends List<? extends isTypeOrSuperTypeOf>> list, long j) {
        getAnimatingAway getanimatingaway;
        if (this.MediaBrowserCompatItemReceiver == 0 || this.MediaBrowserCompatCustomActionResultReceiver == 0 || list.isEmpty() || (PropertyValueAny.AudioAttributesImplApi21Parcelizer(j) == 0 && this.AudioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer() != onDismiss.RemoteActionCompatParcelizer.read)) {
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, 0, 0, null, new getAnswerMap() { // from class: o.performCreateView
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return requireComponentDialog.read((_parser.IconCompatParcelizer) obj);
                }
            }, 4, null);
        }
        List list2 = (List) IntermediateLoginResponseBody.RatingCompat((List) list);
        if (list2.isEmpty()) {
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, 0, 0, null, new getAnswerMap() { // from class: o.onViewStateRestored
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return requireComponentDialog.AudioAttributesCompatParcelizer((_parser.IconCompatParcelizer) obj);
                }
            }, 4, null);
        }
        List list3 = (List) IntermediateLoginResponseBody.read((List) list, 1);
        isTypeOrSuperTypeOf istypeorsupertypeof = list3 != null ? (isTypeOrSuperTypeOf) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list3) : null;
        List list4 = (List) IntermediateLoginResponseBody.read((List) list, 2);
        isTypeOrSuperTypeOf istypeorsupertypeof2 = list4 != null ? (isTypeOrSuperTypeOf) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list4) : null;
        this.AudioAttributesImplBaseParcelizer.read(list2.size());
        requireComponentDialog requirecomponentdialog = this;
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(requirecomponentdialog, istypeorsupertypeof, istypeorsupertypeof2, j);
        Iterator it = list2.iterator();
        float f = this.read;
        float f2 = this.AudioAttributesImplApi21Parcelizer;
        if (getAudioAttributesCompatParcelizer()) {
            getanimatingaway = getAnimatingAway.read;
        } else {
            getanimatingaway = getAnimatingAway.RemoteActionCompatParcelizer;
        }
        return dismissNow.read(withcontentvaluehandler, requirecomponentdialog, (Iterator<? extends isTypeOrSuperTypeOf>) it, f, f2, getNextTransition.AudioAttributesCompatParcelizer(j, getanimatingaway), this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_parser.IconCompatParcelizer iconCompatParcelizer) {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.findBackReference
    public final int IconCompatParcelizer(getValueHandler getvaluehandler, List<? extends List<? extends hasHandlers>> list, int i) {
        onGetLayoutInflater ongetlayoutinflater = this.AudioAttributesImplBaseParcelizer;
        List list2 = (List) IntermediateLoginResponseBody.read((List) list, 1);
        hasHandlers hashandlers = list2 != null ? (hasHandlers) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list2) : null;
        List list3 = (List) IntermediateLoginResponseBody.read((List) list, 2);
        ongetlayoutinflater.write(hashandlers, list3 != null ? (hasHandlers) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list3) : null, getAudioAttributesCompatParcelizer(), PropertyValueBuffer.read$default(0, 0, 0, i, 7, null));
        if (getAudioAttributesCompatParcelizer()) {
            List<? extends hasHandlers> listRemoteActionCompatParcelizer = (List) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) list);
            if (listRemoteActionCompatParcelizer == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            return write(listRemoteActionCompatParcelizer, i, getvaluehandler.IconCompatParcelizer(this.read), getvaluehandler.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer), this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer);
        }
        List<? extends hasHandlers> listRemoteActionCompatParcelizer2 = (List) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) list);
        if (listRemoteActionCompatParcelizer2 == null) {
            listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return IconCompatParcelizer(listRemoteActionCompatParcelizer2, i, getvaluehandler.IconCompatParcelizer(this.read), getvaluehandler.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer), this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer);
    }

    @Override // kotlin.findBackReference
    public final int read(getValueHandler getvaluehandler, List<? extends List<? extends hasHandlers>> list, int i) {
        onGetLayoutInflater ongetlayoutinflater = this.AudioAttributesImplBaseParcelizer;
        List list2 = (List) IntermediateLoginResponseBody.read((List) list, 1);
        hasHandlers hashandlers = list2 != null ? (hasHandlers) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list2) : null;
        List list3 = (List) IntermediateLoginResponseBody.read((List) list, 2);
        ongetlayoutinflater.write(hashandlers, list3 != null ? (hasHandlers) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list3) : null, getAudioAttributesCompatParcelizer(), PropertyValueBuffer.read$default(0, i, 0, 0, 13, null));
        if (getAudioAttributesCompatParcelizer()) {
            List<? extends hasHandlers> listRemoteActionCompatParcelizer = (List) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) list);
            if (listRemoteActionCompatParcelizer == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            return IconCompatParcelizer(listRemoteActionCompatParcelizer, i, getvaluehandler.IconCompatParcelizer(this.read), getvaluehandler.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer), this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer);
        }
        List<? extends hasHandlers> listRemoteActionCompatParcelizer2 = (List) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) list);
        if (listRemoteActionCompatParcelizer2 == null) {
            listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return write(listRemoteActionCompatParcelizer2, i, getvaluehandler.IconCompatParcelizer(this.read), getvaluehandler.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer), this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer);
    }

    @Override // kotlin.findBackReference
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, List<? extends List<? extends hasHandlers>> list, int i) {
        onGetLayoutInflater ongetlayoutinflater = this.AudioAttributesImplBaseParcelizer;
        List list2 = (List) IntermediateLoginResponseBody.read((List) list, 1);
        hasHandlers hashandlers = list2 != null ? (hasHandlers) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list2) : null;
        List list3 = (List) IntermediateLoginResponseBody.read((List) list, 2);
        ongetlayoutinflater.write(hashandlers, list3 != null ? (hasHandlers) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list3) : null, getAudioAttributesCompatParcelizer(), PropertyValueBuffer.read$default(0, i, 0, 0, 13, null));
        if (getAudioAttributesCompatParcelizer()) {
            List<? extends hasHandlers> listRemoteActionCompatParcelizer = (List) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) list);
            if (listRemoteActionCompatParcelizer == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            return IconCompatParcelizer(listRemoteActionCompatParcelizer, i, getvaluehandler.IconCompatParcelizer(this.read), getvaluehandler.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer), this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer);
        }
        List<? extends hasHandlers> listRemoteActionCompatParcelizer2 = (List) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) list);
        if (listRemoteActionCompatParcelizer2 == null) {
            listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return RemoteActionCompatParcelizer(listRemoteActionCompatParcelizer2, i, getvaluehandler.IconCompatParcelizer(this.read));
    }

    @Override // kotlin.findBackReference
    public final int write(getValueHandler getvaluehandler, List<? extends List<? extends hasHandlers>> list, int i) {
        onGetLayoutInflater ongetlayoutinflater = this.AudioAttributesImplBaseParcelizer;
        List list2 = (List) IntermediateLoginResponseBody.read((List) list, 1);
        hasHandlers hashandlers = list2 != null ? (hasHandlers) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list2) : null;
        List list3 = (List) IntermediateLoginResponseBody.read((List) list, 2);
        ongetlayoutinflater.write(hashandlers, list3 != null ? (hasHandlers) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list3) : null, getAudioAttributesCompatParcelizer(), PropertyValueBuffer.read$default(0, 0, 0, i, 7, null));
        if (getAudioAttributesCompatParcelizer()) {
            List<? extends hasHandlers> listRemoteActionCompatParcelizer = (List) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) list);
            if (listRemoteActionCompatParcelizer == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            return RemoteActionCompatParcelizer(listRemoteActionCompatParcelizer, i, getvaluehandler.IconCompatParcelizer(this.read));
        }
        List<? extends hasHandlers> listRemoteActionCompatParcelizer2 = (List) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) list);
        if (listRemoteActionCompatParcelizer2 == null) {
            listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return IconCompatParcelizer(listRemoteActionCompatParcelizer2, i, getvaluehandler.IconCompatParcelizer(this.read), getvaluehandler.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer), this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer);
    }

    public final int RemoteActionCompatParcelizer(List<? extends hasHandlers> p0, int p1, int p2) {
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        int size = p0.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0.get(i2), p1) + p2;
            int i5 = i2 + 1;
            if (i5 - i3 == i || i5 == p0.size()) {
                iMax = Math.max(iMax, (i4 + iRemoteActionCompatParcelizer) - p2);
                i4 = 0;
                i3 = i2;
            } else {
                i4 += iRemoteActionCompatParcelizer;
            }
            i2 = i5;
        }
        return iMax;
    }

    public final int RemoteActionCompatParcelizer(hasHandlers hashandlers, int i) {
        return getAudioAttributesCompatParcelizer() ? hashandlers.write(i) : hashandlers.IconCompatParcelizer(i);
    }

    public final int AudioAttributesCompatParcelizer(hasHandlers hashandlers, int i) {
        return getAudioAttributesCompatParcelizer() ? hashandlers.read(i) : hashandlers.AudioAttributesCompatParcelizer(i);
    }

    public final int write(hasHandlers hashandlers, int i) {
        return getAudioAttributesCompatParcelizer() ? hashandlers.AudioAttributesCompatParcelizer(i) : hashandlers.read(i);
    }

    public final int write(List<? extends hasHandlers> p0, int p1, int p2, int p3, int p4, int p5, onGetLayoutInflater p6) {
        if (p0.isEmpty()) {
            return 0;
        }
        int size = p0.size();
        int[] iArr = new int[size];
        int size2 = p0.size();
        int[] iArr2 = new int[size2];
        int size3 = p0.size();
        for (int i = 0; i < size3; i++) {
            hasHandlers hashandlers = p0.get(i);
            int iWrite = write(hashandlers, p1);
            iArr[i] = iWrite;
            iArr2[i] = AudioAttributesCompatParcelizer(hashandlers, iWrite);
        }
        int i2 = Integer.MAX_VALUE;
        if (p5 != Integer.MAX_VALUE && p4 != Integer.MAX_VALUE) {
            i2 = p4 * p5;
        }
        int i3 = 1;
        int iMin = Math.min(i2 - (((i2 >= p0.size() || !(p6.getRemoteActionCompatParcelizer() == onDismiss.RemoteActionCompatParcelizer.IconCompatParcelizer || p6.getRemoteActionCompatParcelizer() == onDismiss.RemoteActionCompatParcelizer.write)) && (i2 < p0.size() || p5 < p6.getIconCompatParcelizer() || p6.getRemoteActionCompatParcelizer() != onDismiss.RemoteActionCompatParcelizer.write)) ? 0 : 1), p0.size());
        int iMediaBrowserCompatCustomActionResultReceiver = getOrderDetails.MediaBrowserCompatCustomActionResultReceiver(iArr) + ((p0.size() - 1) * p2);
        if (size2 != 0) {
            int iIconCompatParcelizer = iArr2[0];
            int iAudioAttributesImplBaseParcelizer = getOrderDetails.AudioAttributesImplBaseParcelizer(iArr2);
            if (iAudioAttributesImplBaseParcelizer > 0) {
                int i4 = 1;
                while (true) {
                    int i5 = iArr2[i4];
                    if (iIconCompatParcelizer < i5) {
                        iIconCompatParcelizer = i5;
                    }
                    if (i4 == iAudioAttributesImplBaseParcelizer) {
                        break;
                    }
                    i4++;
                }
            }
            if (size != 0) {
                int i6 = iArr[0];
                int iAudioAttributesImplBaseParcelizer2 = getOrderDetails.AudioAttributesImplBaseParcelizer(iArr);
                if (iAudioAttributesImplBaseParcelizer2 > 0) {
                    while (true) {
                        int i7 = iArr[i3];
                        if (i6 < i7) {
                            i6 = i7;
                        }
                        if (i3 == iAudioAttributesImplBaseParcelizer2) {
                            break;
                        }
                        i3++;
                    }
                }
                int i8 = iMediaBrowserCompatCustomActionResultReceiver;
                int i9 = i6;
                while (i9 <= i8 && iIconCompatParcelizer != p1) {
                    int i10 = (i9 + i8) / 2;
                    int i11 = i9;
                    int i12 = i8;
                    long j = dismissNow.read((List<? extends hasHandlers>) p0, iArr, iArr2, i10, p2, p3, p4, p5, p6);
                    iIconCompatParcelizer = setShowingForActionMode.IconCompatParcelizer(j);
                    int iWrite2 = setShowingForActionMode.write(j);
                    if (iIconCompatParcelizer > p1 || iWrite2 < iMin) {
                        int i13 = i10 + 1;
                        if (i13 > i12) {
                            return i13;
                        }
                        i9 = i13;
                        i8 = i12;
                    } else {
                        if (iIconCompatParcelizer >= p1) {
                            return i10;
                        }
                        i8 = i10 - 1;
                        i9 = i11;
                    }
                    iMediaBrowserCompatCustomActionResultReceiver = i10;
                }
                return iMediaBrowserCompatCustomActionResultReceiver;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public final int IconCompatParcelizer(List<? extends hasHandlers> p0, int p1, int p2, int p3, int p4, int p5, onGetLayoutInflater p6) {
        long jWrite;
        int i;
        if (p0.isEmpty()) {
            jWrite = setShowingForActionMode.write(0, 0);
        } else {
            isCancelable iscancelable = new isCancelable(p4, p6, getNextTransition.write(0, p1, 0, Integer.MAX_VALUE), p5, p2, p3, null);
            hasHandlers hashandlers = (hasHandlers) IntermediateLoginResponseBody.read((List) p0, 0);
            int iAudioAttributesCompatParcelizer = hashandlers != null ? AudioAttributesCompatParcelizer(hashandlers, p1) : 0;
            int iWrite = hashandlers != null ? write(hashandlers, iAudioAttributesCompatParcelizer) : 0;
            if (iscancelable.IconCompatParcelizer(p0.size() > 1, 0, setShowingForActionMode.write(p1, Integer.MAX_VALUE), hashandlers == null ? null : setShowingForActionMode.RemoteActionCompatParcelizer(setShowingForActionMode.write(iWrite, iAudioAttributesCompatParcelizer)), 0, 0, 0, false, false).getIconCompatParcelizer()) {
                setShowingForActionMode setshowingforactionmodeRemoteActionCompatParcelizer = p6.RemoteActionCompatParcelizer(hashandlers != null, 0, 0);
                jWrite = setShowingForActionMode.write(setshowingforactionmodeRemoteActionCompatParcelizer != null ? setShowingForActionMode.write(setshowingforactionmodeRemoteActionCompatParcelizer.read()) : 0, 0);
            } else {
                int size = p0.size();
                int i2 = p1;
                int iWrite2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    int i8 = i2 - iWrite;
                    int i9 = i3 + 1;
                    int iMax = Math.max(i4, iAudioAttributesCompatParcelizer);
                    hasHandlers hashandlers2 = (hasHandlers) IntermediateLoginResponseBody.read((List) p0, i9);
                    int iAudioAttributesCompatParcelizer2 = hashandlers2 != null ? AudioAttributesCompatParcelizer(hashandlers2, p1) : 0;
                    int iWrite3 = hashandlers2 != null ? write(hashandlers2, iAudioAttributesCompatParcelizer2) + p2 : 0;
                    boolean z = i3 + 2 < p0.size();
                    int i10 = i9 - i6;
                    int i11 = iWrite3;
                    int i12 = iAudioAttributesCompatParcelizer2;
                    isCancelable.write writeVarIconCompatParcelizer = iscancelable.IconCompatParcelizer(z, i10, setShowingForActionMode.write(i8, Integer.MAX_VALUE), hashandlers2 == null ? null : setShowingForActionMode.RemoteActionCompatParcelizer(setShowingForActionMode.write(iWrite3, iAudioAttributesCompatParcelizer2)), i7, iWrite2, iMax, false, false);
                    if (writeVarIconCompatParcelizer.getRead()) {
                        iWrite2 += iMax + p3;
                        isCancelable.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = iscancelable.write(writeVarIconCompatParcelizer, hashandlers2 != null, i7, iWrite2, i8, i10);
                        i7++;
                        if (writeVarIconCompatParcelizer.getIconCompatParcelizer()) {
                            if (remoteActionCompatParcelizerWrite != null) {
                                long write = remoteActionCompatParcelizerWrite.getWrite();
                                if (!remoteActionCompatParcelizerWrite.getRead()) {
                                    iWrite2 += setShowingForActionMode.write(write) + p3;
                                }
                            }
                            i5 = i9;
                        } else {
                            i = p1;
                            i6 = i9;
                            i4 = 0;
                            iWrite = i11 - p2;
                        }
                    } else {
                        i4 = iMax;
                        i = i8;
                        iWrite = i11;
                    }
                    i3 = i9;
                    i5 = i3;
                    i2 = i;
                    iAudioAttributesCompatParcelizer = i12;
                }
                jWrite = setShowingForActionMode.write(iWrite2 - p3, i5);
            }
        }
        return setShowingForActionMode.IconCompatParcelizer(jWrite);
    }

    public /* synthetic */ requireComponentDialog(boolean z, WindowInsetsCompatImpl30.write writeVar, WindowInsetsCompatImpl30.RatingCompat ratingCompat, float f, BackStackState backStackState, float f2, int i, int i2, onGetLayoutInflater ongetlayoutinflater, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(z, writeVar, ratingCompat, f, backStackState, f2, i, i2, ongetlayoutinflater);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof requireComponentDialog)) {
            return false;
        }
        requireComponentDialog requirecomponentdialog = (requireComponentDialog) p0;
        return this.AudioAttributesCompatParcelizer == requirecomponentdialog.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, requirecomponentdialog.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, requirecomponentdialog.write) && assignParameter.IconCompatParcelizer(this.read, requirecomponentdialog.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, requirecomponentdialog.IconCompatParcelizer) && assignParameter.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, requirecomponentdialog.AudioAttributesImplApi21Parcelizer) && this.MediaBrowserCompatCustomActionResultReceiver == requirecomponentdialog.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatItemReceiver == requirecomponentdialog.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, requirecomponentdialog.AudioAttributesImplBaseParcelizer);
    }

    public final int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.AudioAttributesCompatParcelizer) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.read)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("requireComponentDialog(AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(", read=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.read));
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer));
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
