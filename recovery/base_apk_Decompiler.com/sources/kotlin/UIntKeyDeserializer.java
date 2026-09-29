package kotlin;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class UIntKeyDeserializer extends deserializeUsingCustom {
    private final write read;
    final RecyclerView write;

    public UIntKeyDeserializer(RecyclerView recyclerView) {
        this.write = recyclerView;
        deserializeUsingCustom deserializeusingcustomIconCompatParcelizer = IconCompatParcelizer();
        if (deserializeusingcustomIconCompatParcelizer != null && (deserializeusingcustomIconCompatParcelizer instanceof write)) {
            this.read = (write) deserializeusingcustomIconCompatParcelizer;
        } else {
            this.read = new write(this);
        }
    }

    final boolean write() {
        return this.write.MediaDescriptionCompat();
    }

    @Override // kotlin.deserializeUsingCustom
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (write() || this.write.AudioAttributesImplApi21Parcelizer() == null) {
            return false;
        }
        return this.write.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(i, bundle);
    }

    @Override // kotlin.deserializeUsingCustom
    public void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
        super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
        if (write() || this.write.AudioAttributesImplApi21Parcelizer() == null) {
            return;
        }
        this.write.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(hassuperclassstartingwith);
    }

    @Override // kotlin.deserializeUsingCustom
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || write()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.AudioAttributesImplApi21Parcelizer() != null) {
            recyclerView.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(accessibilityEvent);
        }
    }

    public final deserializeUsingCustom IconCompatParcelizer() {
        return this.read;
    }

    public static class write extends deserializeUsingCustom {
        private Map<View, deserializeUsingCustom> AudioAttributesCompatParcelizer = new WeakHashMap();
        final UIntKeyDeserializer write;

        public write(UIntKeyDeserializer uIntKeyDeserializer) {
            this.write = uIntKeyDeserializer;
        }

        public final void AudioAttributesCompatParcelizer(View view) {
            deserializeUsingCustom deserializeusingcustomRemoteActionCompatParcelizer = InvalidTypeIdException.RemoteActionCompatParcelizer(view);
            if (deserializeusingcustomRemoteActionCompatParcelizer == null || deserializeusingcustomRemoteActionCompatParcelizer == this) {
                return;
            }
            this.AudioAttributesCompatParcelizer.put(view, deserializeusingcustomRemoteActionCompatParcelizer);
        }

        public final deserializeUsingCustom IconCompatParcelizer(View view) {
            return this.AudioAttributesCompatParcelizer.remove(view);
        }

        @Override // kotlin.deserializeUsingCustom
        public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
            if (!this.write.write() && this.write.write.AudioAttributesImplApi21Parcelizer() != null) {
                this.write.write.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(view, hassuperclassstartingwith);
                deserializeUsingCustom deserializeusingcustom = this.AudioAttributesCompatParcelizer.get(view);
                if (deserializeusingcustom != null) {
                    deserializeusingcustom.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
                    return;
                } else {
                    super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
                    return;
                }
            }
            super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
        }

        @Override // kotlin.deserializeUsingCustom
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (!this.write.write() && this.write.write.AudioAttributesImplApi21Parcelizer() != null) {
                deserializeUsingCustom deserializeusingcustom = this.AudioAttributesCompatParcelizer.get(view);
                if (deserializeusingcustom != null) {
                    if (deserializeusingcustom.performAccessibilityAction(view, i, bundle)) {
                        return true;
                    }
                } else if (super.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
                return this.write.write.AudioAttributesImplApi21Parcelizer().onSetCaptioningEnabled();
            }
            return super.performAccessibilityAction(view, i, bundle);
        }

        @Override // kotlin.deserializeUsingCustom
        public final void sendAccessibilityEvent(View view, int i) {
            deserializeUsingCustom deserializeusingcustom = this.AudioAttributesCompatParcelizer.get(view);
            if (deserializeusingcustom != null) {
                deserializeusingcustom.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // kotlin.deserializeUsingCustom
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            deserializeUsingCustom deserializeusingcustom = this.AudioAttributesCompatParcelizer.get(view);
            if (deserializeusingcustom != null) {
                deserializeusingcustom.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }

        @Override // kotlin.deserializeUsingCustom
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            deserializeUsingCustom deserializeusingcustom = this.AudioAttributesCompatParcelizer.get(view);
            if (deserializeusingcustom != null) {
                return deserializeusingcustom.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // kotlin.deserializeUsingCustom
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            deserializeUsingCustom deserializeusingcustom = this.AudioAttributesCompatParcelizer.get(view);
            if (deserializeusingcustom != null) {
                deserializeusingcustom.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // kotlin.deserializeUsingCustom
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            deserializeUsingCustom deserializeusingcustom = this.AudioAttributesCompatParcelizer.get(view);
            if (deserializeusingcustom != null) {
                deserializeusingcustom.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // kotlin.deserializeUsingCustom
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            deserializeUsingCustom deserializeusingcustom = this.AudioAttributesCompatParcelizer.get(viewGroup);
            if (deserializeusingcustom != null) {
                return deserializeusingcustom.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // kotlin.deserializeUsingCustom
        public final AccessorNamingStrategyProvider getAccessibilityNodeProvider(View view) {
            deserializeUsingCustom deserializeusingcustom = this.AudioAttributesCompatParcelizer.get(view);
            if (deserializeusingcustom != null) {
                return deserializeusingcustom.getAccessibilityNodeProvider(view);
            }
            return super.getAccessibilityNodeProvider(view);
        }
    }
}
