package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u000f¢\u0006\u0004\b\b\u0010\u0010\u001a\u0019\u0010\r\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0010\u001a\u0015\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0011\u001a!\u0010\b\u001a\u00020\f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0012\u001a5\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u0013"}, d2 = {"Lo/_handleOddName;", "Lo/assignParameter;", "p0", "p1", "p2", "p3", "AudioAttributesCompatParcelizer", "(Lo/_handleOddName;FFFF)Lo/_handleOddName;", "write", "(Lo/_handleOddName;FF)Lo/_handleOddName;", "IconCompatParcelizer", "(Lo/_handleOddName;F)Lo/_handleOddName;", "Lo/getReturnTransition;", "read", "(Lo/_handleOddName;Lo/getReturnTransition;)Lo/_handleOddName;", "Lo/tryToResolveUnresolved;", "(Lo/getReturnTransition;Lo/tryToResolveUnresolved;)F", "(F)Lo/getReturnTransition;", "(FF)Lo/getReturnTransition;", "(FFFF)Lo/getReturnTransition;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getParentFragment {
    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final float f, final float f2, final float f3, final float f4) {
        return _handleoddname.AudioAttributesCompatParcelizer(new getLoaderManager(f, f2, f3, f4, true, new getAnswerMap() { // from class: o.getPopDirection
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getParentFragment.IconCompatParcelizer(f, f2, f3, f4, (as) obj);
            }
        }, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(float f, float f2, float f3, float f4, as asVar) {
        asVar.write("padding");
        asVar.getIconCompatParcelizer().IconCompatParcelizer(TtmlNode.START, assignParameter.read(f));
        asVar.getIconCompatParcelizer().IconCompatParcelizer("top", assignParameter.read(f2));
        asVar.getIconCompatParcelizer().IconCompatParcelizer(TtmlNode.END, assignParameter.read(f3));
        asVar.getIconCompatParcelizer().IconCompatParcelizer("bottom", assignParameter.read(f4));
        return getShowPopup.INSTANCE;
    }

    public static final _handleOddName write(_handleOddName _handleoddname, final float f, final float f2) {
        return _handleoddname.AudioAttributesCompatParcelizer(new getLoaderManager(f, f2, f, f2, true, new getAnswerMap() { // from class: o.getPostOnViewCreatedAlpha
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getParentFragment.AudioAttributesCompatParcelizer(f, f2, (as) obj);
            }
        }, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(float f, float f2, as asVar) {
        asVar.write("padding");
        asVar.getIconCompatParcelizer().IconCompatParcelizer("horizontal", assignParameter.read(f));
        asVar.getIconCompatParcelizer().IconCompatParcelizer("vertical", assignParameter.read(f2));
        return getShowPopup.INSTANCE;
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, final float f) {
        return _handleoddname.AudioAttributesCompatParcelizer(new getLoaderManager(f, f, f, f, true, new getAnswerMap() { // from class: o.getPopExitAnim
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getParentFragment.AudioAttributesCompatParcelizer(f, (as) obj);
            }
        }, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(float f, as asVar) {
        asVar.write("padding");
        asVar.write(assignParameter.read(f));
        return getShowPopup.INSTANCE;
    }

    public static final _handleOddName read(_handleOddName _handleoddname, final getReturnTransition getreturntransition) {
        return _handleoddname.AudioAttributesCompatParcelizer(new getSharedElementReturnTransition(getreturntransition, new getAnswerMap() { // from class: o.getReenterTransition
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getParentFragment.RemoteActionCompatParcelizer(getreturntransition, (as) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getReturnTransition getreturntransition, as asVar) {
        asVar.write("padding");
        asVar.getIconCompatParcelizer().IconCompatParcelizer("paddingValues", getreturntransition);
        return getShowPopup.INSTANCE;
    }

    public static final float write(getReturnTransition getreturntransition, tryToResolveUnresolved trytoresolveunresolved) {
        if (trytoresolveunresolved == tryToResolveUnresolved.write) {
            return getreturntransition.read(trytoresolveunresolved);
        }
        return getreturntransition.RemoteActionCompatParcelizer(trytoresolveunresolved);
    }

    public static final float read(getReturnTransition getreturntransition, tryToResolveUnresolved trytoresolveunresolved) {
        if (trytoresolveunresolved == tryToResolveUnresolved.write) {
            return getreturntransition.RemoteActionCompatParcelizer(trytoresolveunresolved);
        }
        return getreturntransition.read(trytoresolveunresolved);
    }

    public static final getReturnTransition AudioAttributesCompatParcelizer(float f) {
        return new getSharedElementEnterTransition(f, f, f, f, null);
    }

    public static final getReturnTransition write(float f, float f2) {
        return new getSharedElementEnterTransition(f, f2, f, f2, null);
    }

    public static final getReturnTransition read(float f, float f2, float f3, float f4) {
        return new getSharedElementEnterTransition(f, f2, f3, f4, null);
    }

    public static /* synthetic */ _handleOddName AudioAttributesCompatParcelizer$default(_handleOddName _handleoddname, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        if ((i & 2) != 0) {
            f2 = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        if ((i & 4) != 0) {
            f3 = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        if ((i & 8) != 0) {
            f4 = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        return AudioAttributesCompatParcelizer(_handleoddname, f, f2, f3, f4);
    }

    public static /* synthetic */ _handleOddName write$default(_handleOddName _handleoddname, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        if ((i & 2) != 0) {
            f2 = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        return write(_handleoddname, f, f2);
    }

    public static /* synthetic */ getReturnTransition write$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        if ((i & 2) != 0) {
            f2 = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        return write(f, f2);
    }

    public static /* synthetic */ getReturnTransition read$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        if ((i & 2) != 0) {
            f2 = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        if ((i & 4) != 0) {
            f3 = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        if ((i & 8) != 0) {
            f4 = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        return read(f, f2, f3, f4);
    }
}
