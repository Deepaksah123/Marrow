package kotlin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DayViewDecorator;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import java.util.Collection;
import java.util.Iterator;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes5.dex */
public class setTsSubtitleFormats extends BaseAdapter {
    private Collection<Long> AudioAttributesImplApi26Parcelizer;
    private CalendarConstraints AudioAttributesImplBaseParcelizer;
    public setConstantBitrateSeekingEnabled IconCompatParcelizer;
    private DayViewDecorator MediaBrowserCompatCustomActionResultReceiver;
    final Month read;
    public final DateSelector<?> write;
    static final int RemoteActionCompatParcelizer = getExtractor.write().getMaximum(4);
    private static final int AudioAttributesCompatParcelizer = (getExtractor.write().getMaximum(5) + getExtractor.write().getMaximum(7)) - 1;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    setTsSubtitleFormats(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.read = month;
        this.write = dateSelector;
        this.AudioAttributesImplBaseParcelizer = calendarConstraints;
        this.MediaBrowserCompatCustomActionResultReceiver = dayViewDecorator;
        this.AudioAttributesImplApi26Parcelizer = dateSelector.read();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < read() || i > AudioAttributesCompatParcelizer()) {
            return null;
        }
        return Long.valueOf(this.read.read(MediaBrowserCompatCustomActionResultReceiver(i)));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.read.write;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public TextView getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        read(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.mtrl_calendar_day, viewGroup, false);
        }
        int i3 = i - read();
        if (i3 < 0 || i3 >= this.read.AudioAttributesCompatParcelizer) {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i2 = -1;
        } else {
            i2 = i3 + 1;
            textView.setTag(this.read);
            textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        AudioAttributesCompatParcelizer(textView, item.longValue(), i2);
        return textView;
    }

    public final void AudioAttributesCompatParcelizer(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.AudioAttributesImplApi26Parcelizer.iterator();
        while (it.hasNext()) {
            IconCompatParcelizer(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.write;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.read().iterator();
            while (it2.hasNext()) {
                IconCompatParcelizer(materialCalendarGridView, it2.next().longValue());
            }
            this.AudioAttributesImplApi26Parcelizer = this.write.read();
        }
    }

    private void IconCompatParcelizer(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.RemoteActionCompatParcelizer(j).equals(this.read)) {
            int i = this.read.read(j);
            AudioAttributesCompatParcelizer((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().IconCompatParcelizer(i) - materialCalendarGridView.getFirstVisiblePosition()), j, i);
        }
    }

    private void AudioAttributesCompatParcelizer(TextView textView, long j, int i) {
        setAdtsExtractorFlags setadtsextractorflags;
        if (textView == null) {
            return;
        }
        String strWrite = write(textView.getContext(), j);
        textView.setContentDescription(strWrite);
        if (this.AudioAttributesImplBaseParcelizer.write().RemoteActionCompatParcelizer(j)) {
            textView.setEnabled(true);
            boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(j);
            textView.setSelected(zAudioAttributesCompatParcelizer);
            if (zAudioAttributesCompatParcelizer) {
                setadtsextractorflags = this.IconCompatParcelizer.RemoteActionCompatParcelizer;
            } else if (IconCompatParcelizer(j)) {
                setadtsextractorflags = this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer;
            } else {
                setadtsextractorflags = this.IconCompatParcelizer.IconCompatParcelizer;
            }
        } else {
            textView.setEnabled(false);
            setadtsextractorflags = this.IconCompatParcelizer.AudioAttributesCompatParcelizer;
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver != null && i != -1) {
            int i2 = this.read.RemoteActionCompatParcelizer;
            int i3 = this.read.IconCompatParcelizer;
            setadtsextractorflags.write(textView, null, null);
            textView.setCompoundDrawables(null, null, null, null);
            textView.setContentDescription(DayViewDecorator.read(strWrite));
            return;
        }
        setadtsextractorflags.RemoteActionCompatParcelizer(textView);
    }

    private String write(Context context, long j) {
        return setConstantBitrateSeekingAlwaysEnabled.read(context, j, IconCompatParcelizer(j), write(j), RemoteActionCompatParcelizer(j));
    }

    private static boolean IconCompatParcelizer(long j) {
        return getExtractor.AudioAttributesCompatParcelizer().getTimeInMillis() == j;
    }

    private boolean write(long j) {
        for (StringArrayDeserializer<Long, Long> stringArrayDeserializer : this.write.AudioAttributesCompatParcelizer()) {
            if (stringArrayDeserializer.RemoteActionCompatParcelizer != null && stringArrayDeserializer.RemoteActionCompatParcelizer.longValue() == j) {
                return true;
            }
        }
        return false;
    }

    private boolean RemoteActionCompatParcelizer(long j) {
        for (StringArrayDeserializer<Long, Long> stringArrayDeserializer : this.write.AudioAttributesCompatParcelizer()) {
            if (stringArrayDeserializer.IconCompatParcelizer != null && stringArrayDeserializer.IconCompatParcelizer.longValue() == j) {
                return true;
            }
        }
        return false;
    }

    private boolean AudioAttributesCompatParcelizer(long j) {
        Iterator<Long> it = this.write.read().iterator();
        while (it.hasNext()) {
            if (getExtractor.RemoteActionCompatParcelizer(j) == getExtractor.RemoteActionCompatParcelizer(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void read(Context context) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new setConstantBitrateSeekingEnabled(context);
        }
    }

    public final int read() {
        return this.read.write(this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer());
    }

    public final int AudioAttributesCompatParcelizer() {
        return (read() + this.read.AudioAttributesCompatParcelizer) - 1;
    }

    private int MediaBrowserCompatCustomActionResultReceiver(int i) {
        return (i - read()) + 1;
    }

    public final int IconCompatParcelizer(int i) {
        return read() + (i - 1);
    }

    final boolean read(int i) {
        return i >= read() && i <= AudioAttributesCompatParcelizer();
    }

    public final boolean AudioAttributesCompatParcelizer(int i) {
        return i % this.read.write == 0;
    }

    public final boolean RemoteActionCompatParcelizer(int i) {
        return (i + 1) % this.read.write == 0;
    }
}
