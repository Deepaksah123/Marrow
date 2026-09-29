package in.juspay.hypersdk.mystique;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import in.juspay.hypersdk.core.DuiCallback;

/* JADX INFO: loaded from: classes5.dex */
public class BottomSheetLayout extends FrameLayout {
    private final BottomSheetBehavior bottomSheetBehavior;
    private final BottomSheetCallback bottomSheetCallback;
    private boolean enableShift;
    private boolean overridePeakHeight;

    class BottomSheetCallback extends BottomSheetBehavior.write {
        float bottomShift;
        private DuiCallback duiCallback;
        private float lastReceivedScroll;
        private String stateChangeCallback;
        private String stateSlideCallback;
        float topShift;
        boolean topShiftOverridden = false;
        boolean bottomShiftOverridden = false;

        BottomSheetCallback() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.write
        public void onSlide(View view, float f) {
            this.lastReceivedScroll = f;
            DuiCallback duiCallback = this.duiCallback;
            if (duiCallback == null || this.stateSlideCallback == null) {
                return;
            }
            StringBuilder sb = new StringBuilder("window.callUICallback('");
            sb.append(this.stateSlideCallback);
            sb.append("','");
            sb.append(f);
            sb.append("');");
            duiCallback.addJsToWebView(sb.toString());
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.write
        public void onStateChanged(View view, int i) {
            if (i == 2 && BottomSheetLayout.this.enableShift) {
                if (!this.topShiftOverridden || !this.bottomShiftOverridden) {
                    float fAudioAttributesCompatParcelizer = BottomSheetLayout.this.bottomSheetBehavior.AudioAttributesCompatParcelizer();
                    float fAudioAttributesImplApi26Parcelizer = BottomSheetLayout.this.bottomSheetBehavior.AudioAttributesImplApi26Parcelizer() / view.getHeight();
                    if (!this.topShiftOverridden) {
                        this.topShift = (fAudioAttributesCompatParcelizer / 2.0f) + 0.5f;
                    }
                    if (!this.bottomShiftOverridden) {
                        this.bottomShift = (fAudioAttributesCompatParcelizer / 2.0f) - (fAudioAttributesImplApi26Parcelizer / 2.0f);
                    }
                }
                float f = this.bottomShift;
                float f2 = this.lastReceivedScroll;
                if (f > f2) {
                    BottomSheetLayout.this.bottomSheetBehavior.IconCompatParcelizer(4);
                } else if (f2 <= f || f2 >= this.topShift) {
                    BottomSheetLayout.this.bottomSheetBehavior.IconCompatParcelizer(3);
                } else {
                    BottomSheetLayout.this.bottomSheetBehavior.IconCompatParcelizer(6);
                }
            }
            DuiCallback duiCallback = this.duiCallback;
            if (duiCallback == null || this.stateChangeCallback == null) {
                return;
            }
            StringBuilder sb = new StringBuilder("window.callUICallback('");
            sb.append(this.stateChangeCallback);
            sb.append("','");
            sb.append(i);
            sb.append("');");
            duiCallback.addJsToWebView(sb.toString());
        }

        public void setBottomShift(float f) {
            this.bottomShiftOverridden = true;
            this.bottomShift = f;
        }

        public void setDuiCallback(DuiCallback duiCallback) {
            this.duiCallback = duiCallback;
        }

        public void setSlideCallback(String str) {
            this.stateSlideCallback = str;
        }

        public void setStateChangeCallback(String str) {
            this.stateChangeCallback = str;
        }

        public void setTopShift(float f) {
            this.topShiftOverridden = true;
            this.topShift = f;
        }
    }

    public BottomSheetLayout(Context context) {
        super(context);
        this.enableShift = true;
        this.overridePeakHeight = true;
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
        this.bottomSheetBehavior = bottomSheetBehavior;
        BottomSheetCallback bottomSheetCallback = new BottomSheetCallback();
        this.bottomSheetCallback = bottomSheetCallback;
        bottomSheetBehavior.read(bottomSheetCallback);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.overridePeakHeight) {
            this.bottomSheetBehavior.AudioAttributesCompatParcelizer(getMeasuredHeight());
        }
    }

    public void setBottomShift(float f) {
        this.bottomSheetCallback.setBottomShift(f);
    }

    public void setEnableShift(boolean z) {
        this.enableShift = z;
    }

    public void setHalfExpandedRatio(float f) {
        this.bottomSheetBehavior.RemoteActionCompatParcelizer(f);
    }

    public void setHideable(boolean z) {
        this.bottomSheetBehavior.read(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof CoordinatorLayout.RemoteActionCompatParcelizer) {
            ((CoordinatorLayout.RemoteActionCompatParcelizer) layoutParams).write(this.bottomSheetBehavior);
        }
        super.setLayoutParams(layoutParams);
    }

    public void setPeakHeight(int i) {
        this.bottomSheetBehavior.AudioAttributesCompatParcelizer(i);
        this.overridePeakHeight = false;
    }

    public void setSlideCallback(DuiCallback duiCallback, String str) {
        this.bottomSheetCallback.setDuiCallback(duiCallback);
        this.bottomSheetCallback.setSlideCallback(str);
    }

    public void setState(int i) {
        this.bottomSheetBehavior.IconCompatParcelizer(i);
    }

    public void setStateChangeCallback(DuiCallback duiCallback, String str) {
        this.bottomSheetCallback.setDuiCallback(duiCallback);
        this.bottomSheetCallback.setStateChangeCallback(str);
    }

    public void setTopShift(float f) {
        this.bottomSheetCallback.setTopShift(f);
    }
}
