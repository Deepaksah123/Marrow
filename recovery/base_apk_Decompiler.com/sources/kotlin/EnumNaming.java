package kotlin;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J \u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002J\"\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J$\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002JF\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH\u0002J<\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0005H\u0002JD\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u00052\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J4\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0006\u0010\u001f\u001a\u00020\u0013H\u0002J4\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0006\u0010\u001f\u001a\u00020\u0013H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat;", "", "<init>", "()V", "cachedFocusedRect", "Landroid/graphics/Rect;", "bestCandidateRect", "otherRect", "userSpecifiedFocusComparator", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "tmpList", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "findNextFocus", "root", "Landroid/view/ViewGroup;", "focused", "direction", "", "findNextFocusFromRect", "focusedRect", "getEffectiveRoot", "findNextUserSpecifiedFocus", "focusables", "findNextFocusInRelativeDirection", "setFocusBottomRight", "", "setFocusTopLeft", "findNextFocusInAbsoluteDirection", "getNextFocusable", "count", "getPreviousFocusable", "isValidId", "", "id", "Companion", "UserSpecifiedFocusComparator", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EnumNaming {
    public static final write IconCompatParcelizer = new write(null);
    public static final int AudioAttributesCompatParcelizer = 8;
    private static final IconCompatParcelizer read = new IconCompatParcelizer();
    private final Rect RemoteActionCompatParcelizer = new Rect();
    private final Rect write = new Rect();
    private final Rect AudioAttributesImplApi21Parcelizer = new Rect();
    private final RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer = new RemoteActionCompatParcelizer(new RemoteActionCompatParcelizer.InterfaceC0028RemoteActionCompatParcelizer() { // from class: o.JacksonStdImpl
        @Override // o.EnumNaming.RemoteActionCompatParcelizer.InterfaceC0028RemoteActionCompatParcelizer
        public final View read(View view, View view2) {
            return EnumNaming.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, view, view2);
        }
    });
    private final ArrayList<View> AudioAttributesImplApi26Parcelizer = new ArrayList<>();

    private final boolean AudioAttributesCompatParcelizer(int i) {
        return (i == 0 || i == -1) ? false : true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Lo/EnumNaming$write;", "", "<init>", "()V", "Lo/EnumNaming$IconCompatParcelizer;", "read", "Lo/EnumNaming$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "Lo/EnumNaming;", "IconCompatParcelizer", "()Lo/EnumNaming;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        public final EnumNaming IconCompatParcelizer() {
            EnumNaming enumNaming = EnumNaming.read.get();
            toMagicModuleMetaRepoModel.write(enumNaming);
            return enumNaming;
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/EnumNaming$IconCompatParcelizer;", "Ljava/lang/ThreadLocal;", "Lo/EnumNaming;", "write", "()Lo/EnumNaming;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer extends ThreadLocal<EnumNaming> {
        IconCompatParcelizer() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final EnumNaming initialValue() {
            return new EnumNaming();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View AudioAttributesCompatParcelizer(EnumNaming enumNaming, View view, View view2) {
        if (enumNaming.AudioAttributesCompatParcelizer(view2.getNextFocusForwardId())) {
            return JsonAppend.write(view2, view, 2);
        }
        return null;
    }

    public final View AudioAttributesCompatParcelizer(ViewGroup viewGroup, View view, int i) {
        ViewGroup viewGroupAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(viewGroup, view);
        View viewIconCompatParcelizer = IconCompatParcelizer(viewGroupAudioAttributesCompatParcelizer, view, i);
        if (viewIconCompatParcelizer != null) {
            return viewIconCompatParcelizer;
        }
        ArrayList<View> arrayList = this.AudioAttributesImplApi26Parcelizer;
        try {
            arrayList.clear();
            JsonAppend.read(viewGroupAudioAttributesCompatParcelizer, (ArrayList<View>) arrayList, i);
            if (!arrayList.isEmpty()) {
                viewIconCompatParcelizer = read(viewGroupAudioAttributesCompatParcelizer, view, null, i, arrayList);
            }
            return viewIconCompatParcelizer;
        } finally {
            arrayList.clear();
        }
    }

    public final View write(ViewGroup viewGroup, Rect rect, int i) {
        this.RemoteActionCompatParcelizer.set(rect);
        return RemoteActionCompatParcelizer(viewGroup, this.RemoteActionCompatParcelizer, i);
    }

    private final ViewGroup AudioAttributesCompatParcelizer(ViewGroup viewGroup, View view) {
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup) {
                    ViewGroup viewGroup3 = (ViewGroup) parent;
                    if (viewGroup3.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup2 = viewGroup3;
                    }
                    parent = viewGroup3.getParent();
                } else if (viewGroup2 != null) {
                    return viewGroup2;
                }
            }
        }
        return viewGroup;
    }

    private final View IconCompatParcelizer(ViewGroup viewGroup, View view, int i) {
        ViewGroup viewGroup2 = viewGroup;
        View viewWrite = JsonAppend.write(view, viewGroup2, i);
        boolean z = true;
        View viewWrite2 = viewWrite;
        while (viewWrite != null) {
            if (viewWrite.isFocusable() && viewWrite.getVisibility() == 0 && (!viewWrite.isInTouchMode() || viewWrite.isFocusableInTouchMode())) {
                return viewWrite;
            }
            viewWrite = JsonAppend.write(viewWrite, viewGroup2, i);
            if (!z) {
                viewWrite2 = viewWrite2 != null ? JsonAppend.write(viewWrite2, viewGroup2, i) : null;
                if (viewWrite2 == viewWrite) {
                    break;
                }
            }
            z = !z;
        }
        return null;
    }

    private final View RemoteActionCompatParcelizer(ViewGroup viewGroup, Rect rect, int i) {
        ViewGroup viewGroupAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(viewGroup, null);
        ArrayList<View> arrayList = this.AudioAttributesImplApi26Parcelizer;
        try {
            arrayList.clear();
            JsonAppend.read(viewGroupAudioAttributesCompatParcelizer, (ArrayList<View>) arrayList, i);
            if (arrayList.isEmpty()) {
                return null;
            }
            return read(viewGroupAudioAttributesCompatParcelizer, null, rect, i, arrayList);
        } finally {
            arrayList.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.view.View read(android.view.ViewGroup r8, android.view.View r9, android.graphics.Rect r10, int r11, java.util.ArrayList<android.view.View> r12) {
        /*
            r7 = this;
            android.graphics.Rect r3 = r7.RemoteActionCompatParcelizer
            r0 = 130(0x82, float:1.82E-43)
            r1 = 66
            r2 = 33
            r4 = 17
            r5 = 2
            r6 = 1
            if (r9 == 0) goto L15
            r9.getFocusedRect(r3)
            r8.offsetDescendantRectToMyCoords(r9, r3)
            goto L46
        L15:
            if (r10 == 0) goto L1b
            r3.set(r10)
            goto L46
        L1b:
            if (r11 == r6) goto L39
            if (r11 == r5) goto L2f
            if (r11 == r4) goto L2b
            if (r11 == r2) goto L2b
            if (r11 == r1) goto L27
            if (r11 != r0) goto L46
        L27:
            r7.write(r8, r3)
            goto L46
        L2b:
            r7.read(r8, r3)
            goto L46
        L2f:
            int r10 = r8.getLayoutDirection()
            if (r10 == r6) goto L43
            r7.write(r8, r3)
            goto L46
        L39:
            int r10 = r8.getLayoutDirection()
            if (r10 != r6) goto L43
            r7.write(r8, r3)
            goto L46
        L43:
            r7.read(r8, r3)
        L46:
            if (r11 == r6) goto L6d
            if (r11 == r5) goto L6d
            if (r11 == r4) goto L63
            if (r11 == r2) goto L63
            if (r11 == r1) goto L63
            if (r11 != r0) goto L53
            goto L63
        L53:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Unknown direction: "
            java.lang.String r9 = java.lang.String.valueOf(r11)
            java.lang.String r8 = r8.concat(r9)
            r7.<init>(r8)
            throw r7
        L63:
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r12
            r5 = r11
            android.view.View r7 = r0.AudioAttributesCompatParcelizer(r1, r2, r3, r4, r5)
            return r7
        L6d:
            android.view.View r7 = r7.read(r12, r8, r9, r11)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.EnumNaming.read(android.view.ViewGroup, android.view.View, android.graphics.Rect, int, java.util.ArrayList):android.view.View");
    }

    private final View read(ArrayList<View> arrayList, ViewGroup viewGroup, View view, int i) {
        try {
            this.AudioAttributesImplBaseParcelizer.write(arrayList, viewGroup);
            Collections.sort(arrayList, this.AudioAttributesImplBaseParcelizer);
            this.AudioAttributesImplBaseParcelizer.read();
            int size = arrayList.size();
            View viewWrite = null;
            if (size < 2) {
                return null;
            }
            if (i == 1) {
                viewWrite = write(view, arrayList, size);
            } else if (i == 2) {
                viewWrite = read(view, arrayList, size);
            } else if (i == 17 || i == 33 || i == 66 || i == 130) {
                viewWrite = AudioAttributesCompatParcelizer(viewGroup, view, this.RemoteActionCompatParcelizer, arrayList, i);
            }
            return viewWrite == null ? arrayList.get(size - 1) : viewWrite;
        } catch (Throwable th) {
            this.AudioAttributesImplBaseParcelizer.read();
            throw th;
        }
    }

    private final void read(ViewGroup viewGroup, Rect rect) {
        int scrollY = viewGroup.getScrollY() + viewGroup.getHeight();
        int scrollX = viewGroup.getScrollX() + viewGroup.getWidth();
        rect.set(scrollX, scrollY, scrollX, scrollY);
    }

    private final void write(ViewGroup viewGroup, Rect rect) {
        int scrollY = viewGroup.getScrollY();
        int scrollX = viewGroup.getScrollX();
        rect.set(scrollX, scrollY, scrollX, scrollY);
    }

    private final View AudioAttributesCompatParcelizer(ViewGroup viewGroup, View view, Rect rect, ArrayList<View> arrayList, int i) {
        this.write.set(rect);
        if (i == 17) {
            this.write.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            this.write.offset(0, rect.height() + 1);
        } else if (i == 66) {
            this.write.offset((-rect.width()) - 1, 0);
        } else if (i == 130) {
            this.write.offset(0, (-rect.height()) - 1);
        }
        ArrayList<View> arrayList2 = arrayList;
        int size = arrayList2.size();
        View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = arrayList2.get(i2);
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(view3, view) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(view3, viewGroup)) {
                view3.getFocusedRect(this.AudioAttributesImplApi21Parcelizer);
                viewGroup.offsetDescendantRectToMyCoords(view3, this.AudioAttributesImplApi21Parcelizer);
                WritableTypeIdInclusion writableTypeIdInclusionWrite = VersionUtil.write(this.AudioAttributesImplApi21Parcelizer);
                WritableTypeIdInclusion writableTypeIdInclusionWrite2 = VersionUtil.write(this.write);
                WritableTypeIdInclusion writableTypeIdInclusionWrite3 = VersionUtil.write(rect);
                _checkNeedForRehash _checkneedforrehashAudioAttributesCompatParcelizer = _findSecondary.AudioAttributesCompatParcelizer(i);
                if (has.RemoteActionCompatParcelizer(writableTypeIdInclusionWrite, writableTypeIdInclusionWrite2, writableTypeIdInclusionWrite3, _checkneedforrehashAudioAttributesCompatParcelizer != null ? _checkneedforrehashAudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() : _checkNeedForRehash.INSTANCE.write())) {
                    this.write.set(this.AudioAttributesImplApi21Parcelizer);
                    view2 = view3;
                }
            }
        }
        return view2;
    }

    private final View read(View view, ArrayList<View> arrayList, int i) {
        int iLastIndexOf;
        int i2;
        if (i < 2) {
            return null;
        }
        if (view != null && (iLastIndexOf = arrayList.lastIndexOf(view)) >= 0 && (i2 = iLastIndexOf + 1) < i) {
            return arrayList.get(i2);
        }
        return arrayList.get(0);
    }

    private final View write(View view, ArrayList<View> arrayList, int i) {
        int iIndexOf;
        if (i < 2) {
            return null;
        }
        if (view != null && (iIndexOf = arrayList.indexOf(view)) > 0) {
            return arrayList.get(iIndexOf - 1);
        }
        return arrayList.get(i - 1);
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003:\u0001\u001cB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J&\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0002J\u001c\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "Ljava/util/Comparator;", "Landroid/view/View;", "Lkotlin/Comparator;", "mNextFocusGetter", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "<init>", "(Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;)V", "nextFoci", "Landroidx/collection/MutableScatterMap;", "isConnectedTo", "Landroidx/collection/MutableScatterSet;", "headsOfChains", "originalOrdinal", "Landroidx/collection/MutableObjectIntMap;", "root", "recycle", "", "setFocusables", "focusables", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setHeadOfChain", TtmlNode.TAG_HEAD, "compare", "", "first", "second", "NextFocusGetter", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements Comparator<View> {
        private View MediaBrowserCompatCustomActionResultReceiver;
        private final InterfaceC0028RemoteActionCompatParcelizer read;
        private final setKeyListener<View, View> IconCompatParcelizer = setAutoSizeTextTypeUniformWithPresetSizes.read();
        private final setEmojiCompatEnabled<View> write = setSupportAllCaps.AudioAttributesCompatParcelizer();
        private final setKeyListener<View, View> RemoteActionCompatParcelizer = setAutoSizeTextTypeUniformWithPresetSizes.read();
        private final AlertDialogLayout<View> AudioAttributesCompatParcelizer = setSupportCompoundDrawablesTintList.IconCompatParcelizer();

        /* JADX INFO: renamed from: o.EnumNaming$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/EnumNaming$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;", "", "Landroid/view/View;", "p0", "p1", "read", "(Landroid/view/View;Landroid/view/View;)Landroid/view/View;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface InterfaceC0028RemoteActionCompatParcelizer {
            View read(View p0, View p1);
        }

        public RemoteActionCompatParcelizer(InterfaceC0028RemoteActionCompatParcelizer interfaceC0028RemoteActionCompatParcelizer) {
            this.read = interfaceC0028RemoteActionCompatParcelizer;
        }

        public final void read() {
            this.MediaBrowserCompatCustomActionResultReceiver = null;
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            this.write.RemoteActionCompatParcelizer();
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        public final void write(ArrayList<View> arrayList, View view) {
            this.MediaBrowserCompatCustomActionResultReceiver = view;
            ArrayList<View> arrayList2 = arrayList;
            ArrayList<View> arrayList3 = arrayList2;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(arrayList2.get(i), i);
            }
            int size2 = arrayList3.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i2 = size2 - 1;
                    View view2 = arrayList2.get(size2);
                    View view3 = this.read.read(view, view2);
                    if (view3 != null && this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(view3)) {
                        this.IconCompatParcelizer.RemoteActionCompatParcelizer(view2, view3);
                        this.write.write(view3);
                    }
                    if (i2 < 0) {
                        break;
                    } else {
                        size2 = i2;
                    }
                }
            }
            int size3 = arrayList3.size() - 1;
            if (size3 < 0) {
                return;
            }
            while (true) {
                int i3 = size3 - 1;
                View view4 = arrayList2.get(size3);
                if (this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(view4) != null && !this.write.RemoteActionCompatParcelizer(view4)) {
                    write(view4);
                }
                if (i3 < 0) {
                    return;
                } else {
                    size3 = i3;
                }
            }
        }

        public final void write(View view) {
            View view2 = view;
            while (view != null) {
                View viewAudioAttributesImplApi26Parcelizer = this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(view);
                if (viewAudioAttributesImplApi26Parcelizer != null) {
                    if (viewAudioAttributesImplApi26Parcelizer == view2) {
                        return;
                    }
                    view = view2;
                    view2 = viewAudioAttributesImplApi26Parcelizer;
                }
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(view, view2);
                view = this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(view);
            }
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final int compare(View view, View view2) {
            if (view == view2) {
                return 0;
            }
            if (view == null) {
                return -1;
            }
            if (view2 == null) {
                return 1;
            }
            View viewAudioAttributesImplApi26Parcelizer = this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(view);
            View viewAudioAttributesImplApi26Parcelizer2 = this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(view2);
            if (viewAudioAttributesImplApi26Parcelizer == viewAudioAttributesImplApi26Parcelizer2 && viewAudioAttributesImplApi26Parcelizer != null) {
                if (view == viewAudioAttributesImplApi26Parcelizer) {
                    return -1;
                }
                return (view2 == viewAudioAttributesImplApi26Parcelizer || this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(view) == null) ? 1 : -1;
            }
            if (viewAudioAttributesImplApi26Parcelizer != null) {
                view = viewAudioAttributesImplApi26Parcelizer;
            }
            if (viewAudioAttributesImplApi26Parcelizer2 != null) {
                view2 = viewAudioAttributesImplApi26Parcelizer2;
            }
            if (viewAudioAttributesImplApi26Parcelizer == null && viewAudioAttributesImplApi26Parcelizer2 == null) {
                return 0;
            }
            return this.AudioAttributesCompatParcelizer.write(view) < this.AudioAttributesCompatParcelizer.write(view2) ? -1 : 1;
        }
    }
}
