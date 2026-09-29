package kotlin;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\"\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u001a*\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u001a,\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002\u001a,\u0010\u000e\u001a\u00020\u000f*\u00020\u00012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0011j\b\u0012\u0004\u0012\u00020\u0001`\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a,\u0010\u000e\u001a\u00020\u000f*\u00020\u00012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0011j\b\u0012\u0004\u0012\u00020\u0001`\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¨\u0006\u0014"}, d2 = {"findUserSetNextFocus", "Landroid/view/View;", "root", "direction", "", "findViewInsideOutShouldExist", TtmlNode.START, "id", "findViewByPredicateInsideOut", "predicate", "Lkotlin/Function1;", "", "findViewByPredicateTraversal", "childToSkip", "addFocusableViews", "", "views", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "inTouchMode", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonAppend {
    /* JADX INFO: Access modifiers changed from: private */
    public static final View write(View view, View view2, int i) {
        int nextFocusForwardId;
        if (i == 1) {
            if (view.getId() == -1) {
                return null;
            }
            return RemoteActionCompatParcelizer(view2, view, new AnonymousClass4(view2, view));
        }
        if (i == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return RemoteActionCompatParcelizer(view2, view, nextFocusForwardId);
        }
        return null;
    }

    /* JADX INFO: renamed from: o.JsonAppend$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "p0", "", "IconCompatParcelizer", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<View, Boolean> {
        final /* synthetic */ View $IconCompatParcelizer;
        final /* synthetic */ View $read;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(View view) {
            return Boolean.valueOf(JsonAppend.RemoteActionCompatParcelizer(this.$IconCompatParcelizer, view, view.getNextFocusForwardId()) == this.$read);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(View view, View view2) {
            super(1);
            this.$IconCompatParcelizer = view;
            this.$read = view2;
        }
    }

    /* JADX INFO: renamed from: o.JsonAppend$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "p0", "", "write", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<View, Boolean> {
        final /* synthetic */ int $write;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(View view) {
            return Boolean.valueOf(view.getId() == this.$write);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(int i) {
            super(1);
            this.$write = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View RemoteActionCompatParcelizer(View view, View view2, int i) {
        return RemoteActionCompatParcelizer(view, view2, new AnonymousClass3(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.View RemoteActionCompatParcelizer(android.view.View r4, android.view.View r5, kotlin.getAnswerMap<? super android.view.View, java.lang.Boolean> r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            android.view.View r1 = read(r5, r6, r1)
            if (r1 != 0) goto L1b
            if (r5 == r4) goto L1b
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L1a
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L1a
            android.view.View r1 = (android.view.View) r1
            r3 = r1
            r1 = r5
            r5 = r3
            goto L2
        L1a:
            return r0
        L1b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JsonAppend.RemoteActionCompatParcelizer(android.view.View, android.view.View, o.getAnswerMap):android.view.View");
    }

    private static final View read(View view, getAnswerMap<? super View, Boolean> getanswermap, View view2) {
        View view3;
        if (getanswermap.invoke(view).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (view3 = read(childAt, getanswermap, view2)) != null) {
                return view3;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(View view, ArrayList<View> arrayList, int i) {
        view.addFocusables(arrayList, i, view.isInTouchMode() ? 1 : 0);
    }
}
