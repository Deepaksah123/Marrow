package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.InvalidTypeIdException;
import kotlin.StringArrayDeserializer;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.deserializeUsingCustom;
import kotlin.getExtractor;
import kotlin.hasSuperClassStartingWith;
import kotlin.setConstantBitrateSeekingEnabled;
import kotlin.setMp3ExtractorFlags;
import kotlin.setTsSubtitleFormats;

/* JADX INFO: loaded from: classes5.dex */
public final class MaterialCalendarGridView extends GridView {
    private final boolean IconCompatParcelizer;
    private final Calendar read;

    @Override // android.widget.AdapterView
    public final /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        setAdapter((ListAdapter) adapter);
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.read = getExtractor.write();
        if (setMp3ExtractorFlags.AudioAttributesCompatParcelizer(getContext())) {
            setNextFocusLeftId(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.cancel_button);
            setNextFocusRightId(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.confirm_button);
        }
        this.IconCompatParcelizer = setMp3ExtractorFlags.IconCompatParcelizer(getContext());
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this, new deserializeUsingCustom() { // from class: com.google.android.material.datepicker.MaterialCalendarGridView.5
            @Override // kotlin.deserializeUsingCustom
            public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
                super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
                hassuperclassstartingwith.RemoteActionCompatParcelizer((Object) null);
            }
        });
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < getAdapter().read()) {
            super.setSelection(getAdapter().read());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().read()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().read());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final setTsSubtitleFormats getAdapter() {
        return (setTsSubtitleFormats) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof setTsSubtitleFormats)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), setTsSubtitleFormats.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int iIconCompatParcelizer;
        int iIconCompatParcelizer2;
        int iIconCompatParcelizer3;
        int iIconCompatParcelizer4;
        int width;
        int i;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        setTsSubtitleFormats adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.write;
        setConstantBitrateSeekingEnabled setconstantbitrateseekingenabled = adapter.IconCompatParcelizer;
        int iMax = Math.max(adapter.read(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.AudioAttributesCompatParcelizer(), getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        Iterator<StringArrayDeserializer<Long, Long>> it = dateSelector.AudioAttributesCompatParcelizer().iterator();
        while (it.hasNext()) {
            StringArrayDeserializer<Long, Long> next = it.next();
            if (next.RemoteActionCompatParcelizer != null && next.IconCompatParcelizer != null) {
                long jLongValue = next.RemoteActionCompatParcelizer.longValue();
                long jLongValue2 = next.IconCompatParcelizer.longValue();
                if (!AudioAttributesCompatParcelizer(item, item2, Long.valueOf(jLongValue), Long.valueOf(jLongValue2))) {
                    boolean zAudioAttributesImplBaseParcelizer = checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(this);
                    if (jLongValue < item.longValue()) {
                        if (adapter.AudioAttributesCompatParcelizer(iMax)) {
                            left2 = 0;
                        } else if (!zAudioAttributesImplBaseParcelizer) {
                            left2 = materialCalendarGridView.IconCompatParcelizer(iMax - 1).getRight();
                        } else {
                            left2 = materialCalendarGridView.IconCompatParcelizer(iMax - 1).getLeft();
                        }
                        iIconCompatParcelizer2 = left2;
                        iIconCompatParcelizer = iMax;
                    } else {
                        materialCalendarGridView.read.setTimeInMillis(jLongValue);
                        iIconCompatParcelizer = adapter.IconCompatParcelizer(materialCalendarGridView.read.get(5));
                        iIconCompatParcelizer2 = IconCompatParcelizer(materialCalendarGridView.IconCompatParcelizer(iIconCompatParcelizer));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        if (adapter.RemoteActionCompatParcelizer(iMin)) {
                            left = getWidth();
                        } else if (!zAudioAttributesImplBaseParcelizer) {
                            left = materialCalendarGridView.IconCompatParcelizer(iMin).getRight();
                        } else {
                            left = materialCalendarGridView.IconCompatParcelizer(iMin).getLeft();
                        }
                        iIconCompatParcelizer4 = left;
                        iIconCompatParcelizer3 = iMin;
                    } else {
                        materialCalendarGridView.read.setTimeInMillis(jLongValue2);
                        iIconCompatParcelizer3 = adapter.IconCompatParcelizer(materialCalendarGridView.read.get(5));
                        iIconCompatParcelizer4 = IconCompatParcelizer(materialCalendarGridView.IconCompatParcelizer(iIconCompatParcelizer3));
                    }
                    int itemId = (int) adapter.getItemId(iIconCompatParcelizer);
                    int i2 = iMax;
                    int i3 = iMin;
                    int itemId2 = (int) adapter.getItemId(iIconCompatParcelizer3);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View viewIconCompatParcelizer = materialCalendarGridView.IconCompatParcelizer(numColumns);
                        int top = viewIconCompatParcelizer.getTop();
                        int iIconCompatParcelizer5 = setconstantbitrateseekingenabled.IconCompatParcelizer.IconCompatParcelizer();
                        int bottom = viewIconCompatParcelizer.getBottom();
                        setTsSubtitleFormats settssubtitleformats = adapter;
                        int iRemoteActionCompatParcelizer = setconstantbitrateseekingenabled.IconCompatParcelizer.RemoteActionCompatParcelizer();
                        if (!zAudioAttributesImplBaseParcelizer) {
                            i = numColumns > iIconCompatParcelizer ? 0 : iIconCompatParcelizer2;
                            width = iIconCompatParcelizer3 > numColumns2 ? getWidth() : iIconCompatParcelizer4;
                        } else {
                            int i4 = iIconCompatParcelizer3 > numColumns2 ? 0 : iIconCompatParcelizer4;
                            width = numColumns > iIconCompatParcelizer ? getWidth() : iIconCompatParcelizer2;
                            i = i4;
                        }
                        canvas.drawRect(i, top + iIconCompatParcelizer5, width, bottom - iRemoteActionCompatParcelizer, setconstantbitrateseekingenabled.write);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter = settssubtitleformats;
                    }
                    materialCalendarGridView = this;
                    iMax = i2;
                    iMin = i3;
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.IconCompatParcelizer) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            AudioAttributesCompatParcelizer(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    private void AudioAttributesCompatParcelizer(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().AudioAttributesCompatParcelizer());
        } else if (i == 130) {
            setSelection(getAdapter().read());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    private View IconCompatParcelizer(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    private static boolean AudioAttributesCompatParcelizer(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    private static int IconCompatParcelizer(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }
}
