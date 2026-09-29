package kotlin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DayViewDecorator;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import kotlin.calculateNextSearchBytePosition;
import kotlin.setMatroskaExtractorFlags;

/* JADX INFO: loaded from: classes5.dex */
final class setTsExtractorMode extends RecyclerView.IconCompatParcelizer<RemoteActionCompatParcelizer> {
    private final CalendarConstraints AudioAttributesCompatParcelizer;
    private final setMatroskaExtractorFlags.write IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final DayViewDecorator read;
    private final DateSelector<?> write;

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return IconCompatParcelizer(viewGroup);
    }

    setTsExtractorMode(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, setMatroskaExtractorFlags.write writeVar) {
        Month monthAudioAttributesImplApi21Parcelizer = calendarConstraints.AudioAttributesImplApi21Parcelizer();
        Month monthRemoteActionCompatParcelizer = calendarConstraints.RemoteActionCompatParcelizer();
        Month month = calendarConstraints.read();
        if (monthAudioAttributesImplApi21Parcelizer.compareTo(month) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month.compareTo(monthRemoteActionCompatParcelizer) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.RemoteActionCompatParcelizer = (setTsSubtitleFormats.RemoteActionCompatParcelizer * setMatroskaExtractorFlags.read(context)) + (setMp3ExtractorFlags.AudioAttributesCompatParcelizer(context) ? setMatroskaExtractorFlags.read(context) : 0);
        this.AudioAttributesCompatParcelizer = calendarConstraints;
        this.write = dateSelector;
        this.read = dayViewDecorator;
        this.IconCompatParcelizer = writeVar;
        setHasStableIds(true);
    }

    public static class RemoteActionCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        final TextView RemoteActionCompatParcelizer;
        final MaterialCalendarGridView write;

        RemoteActionCompatParcelizer(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.month_title);
            this.RemoteActionCompatParcelizer = textView;
            InvalidTypeIdException.read((View) textView, true);
            this.write = (MaterialCalendarGridView) linearLayout.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    private RemoteActionCompatParcelizer IconCompatParcelizer(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.mtrl_calendar_month_labeled, viewGroup, false);
        if (setMp3ExtractorFlags.AudioAttributesCompatParcelizer(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.RemoteActionCompatParcelizer));
            return new RemoteActionCompatParcelizer(linearLayout, true);
        }
        return new RemoteActionCompatParcelizer(linearLayout, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        Month monthAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(i);
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer.setText(monthAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) remoteActionCompatParcelizer.write.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.month_grid);
        if (materialCalendarGridView.getAdapter() != null && monthAudioAttributesCompatParcelizer.equals(materialCalendarGridView.getAdapter().read)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().AudioAttributesCompatParcelizer(materialCalendarGridView);
        } else {
            setTsSubtitleFormats settssubtitleformats = new setTsSubtitleFormats(monthAudioAttributesCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer, this.read);
            materialCalendarGridView.setNumColumns(monthAudioAttributesCompatParcelizer.write);
            materialCalendarGridView.setAdapter((ListAdapter) settssubtitleformats);
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.setTsExtractorMode.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                if (materialCalendarGridView.getAdapter().read(i2)) {
                    setTsExtractorMode.this.IconCompatParcelizer.write(materialCalendarGridView.getAdapter().getItem(i2).longValue());
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final long getItemId(int i) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(i).write();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    final CharSequence RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer(i).RemoteActionCompatParcelizer();
    }

    final Month AudioAttributesCompatParcelizer(int i) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(i);
    }

    final int write(Month month) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().write(month);
    }
}
