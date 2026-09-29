package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes5.dex */
final class setAmrExtractorFlags extends BaseAdapter {
    private static final int IconCompatParcelizer = 4;
    private final Calendar AudioAttributesCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final int write;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public setAmrExtractorFlags() {
        Calendar calendarWrite = getExtractor.write();
        this.AudioAttributesCompatParcelizer = calendarWrite;
        this.write = calendarWrite.getMaximum(7);
        this.RemoteActionCompatParcelizer = calendarWrite.getFirstDayOfWeek();
    }

    public setAmrExtractorFlags(int i) {
        Calendar calendarWrite = getExtractor.write();
        this.AudioAttributesCompatParcelizer = calendarWrite;
        this.write = calendarWrite.getMaximum(7);
        this.RemoteActionCompatParcelizer = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i) {
        if (i >= this.write) {
            return null;
        }
        return Integer.valueOf(write(i));
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.write;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.AudioAttributesCompatParcelizer.set(7, write(i));
        textView.setText(this.AudioAttributesCompatParcelizer.getDisplayName(7, IconCompatParcelizer, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_picker_day_of_week_column_header), this.AudioAttributesCompatParcelizer.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    private int write(int i) {
        int i2 = i + this.RemoteActionCompatParcelizer;
        int i3 = this.write;
        return i2 > i3 ? i2 - i3 : i2;
    }
}
