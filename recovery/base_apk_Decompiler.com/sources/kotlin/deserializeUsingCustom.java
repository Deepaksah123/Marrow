package kotlin;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import kotlin._byteOverflow;
import kotlin.hasSuperClassStartingWith;

/* JADX INFO: loaded from: classes2.dex */
public class deserializeUsingCustom {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    static final class write extends View.AccessibilityDelegate {
        final deserializeUsingCustom write;

        write(deserializeUsingCustom deserializeusingcustom) {
            this.write = deserializeusingcustom;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.write.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.write.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            hasSuperClassStartingWith hassuperclassstartingwithWrite = hasSuperClassStartingWith.write(accessibilityNodeInfo);
            hassuperclassstartingwithWrite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(InvalidTypeIdException.onPrepareFromUri(view));
            hassuperclassstartingwithWrite.MediaBrowserCompatSearchResultReceiver(InvalidTypeIdException.onPlayFromUri(view));
            hassuperclassstartingwithWrite.AudioAttributesImplApi21Parcelizer(InvalidTypeIdException.read(view));
            hassuperclassstartingwithWrite.AudioAttributesImplApi26Parcelizer(InvalidTypeIdException.onAddQueueItem(view));
            this.write.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwithWrite);
            hassuperclassstartingwithWrite.write(accessibilityNodeInfo.getText(), view);
            List<hasSuperClassStartingWith.read> actionList = deserializeUsingCustom.getActionList(view);
            for (int i = 0; i < actionList.size(); i++) {
                hassuperclassstartingwithWrite.AudioAttributesCompatParcelizer(actionList.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.write.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.write.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i) {
            this.write.sendAccessibilityEvent(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.write.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessorNamingStrategyProvider accessibilityNodeProvider = this.write.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.read();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.write.performAccessibilityAction(view, i, bundle);
        }
    }

    public deserializeUsingCustom() {
        this(DEFAULT_DELEGATE);
    }

    public deserializeUsingCustom(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new write(this);
    }

    View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith.onSetRating());
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public AccessorNamingStrategyProvider getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new AccessorNamingStrategyProvider(accessibilityNodeProvider);
        }
        return null;
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        List<hasSuperClassStartingWith.read> actionList = getActionList(view);
        boolean zPerformAccessibilityAction = false;
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            hasSuperClassStartingWith.read readVar = actionList.get(i2);
            if (readVar.RemoteActionCompatParcelizer() == i) {
                zPerformAccessibilityAction = readVar.read(view, bundle);
                break;
            }
            i2++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.mOriginalDelegate.performAccessibilityAction(view, i, bundle);
        }
        return (zPerformAccessibilityAction || i != _byteOverflow.IconCompatParcelizer.accessibility_action_clickable_span || bundle == null) ? zPerformAccessibilityAction : performClickableSpanAction(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    private boolean performClickableSpanAction(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(_byteOverflow.IconCompatParcelizer.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!isSpanStillValid(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrWrite = hasSuperClassStartingWith.write(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; clickableSpanArrWrite != null && i < clickableSpanArrWrite.length; i++) {
                if (clickableSpan.equals(clickableSpanArrWrite[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    static List<hasSuperClassStartingWith.read> getActionList(View view) {
        List<hasSuperClassStartingWith.read> list = (List) view.getTag(_byteOverflow.IconCompatParcelizer.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }
}
