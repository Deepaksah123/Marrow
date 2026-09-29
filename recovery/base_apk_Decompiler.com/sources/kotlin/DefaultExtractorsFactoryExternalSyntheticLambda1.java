package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.images.zab;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import kotlin.calculateNextSearchBytePosition;
import kotlin.setMatroskaExtractorFlags;

/* JADX INFO: loaded from: classes5.dex */
final class DefaultExtractorsFactoryExternalSyntheticLambda1 extends RecyclerView.IconCompatParcelizer<IconCompatParcelizer> {
    private final setMatroskaExtractorFlags<?> write;

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return RemoteActionCompatParcelizer(viewGroup);
    }

    public static class IconCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        final TextView write;

        IconCompatParcelizer(TextView textView) {
            super(textView);
            this.write = textView;
        }
    }

    DefaultExtractorsFactoryExternalSyntheticLambda1(setMatroskaExtractorFlags<?> setmatroskaextractorflags) {
        this.write = setmatroskaextractorflags;
    }

    private static IconCompatParcelizer RemoteActionCompatParcelizer(ViewGroup viewGroup) {
        return new IconCompatParcelizer((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.mtrl_calendar_year, viewGroup, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(IconCompatParcelizer iconCompatParcelizer, int i) {
        int i2 = read(i);
        iconCompatParcelizer.write.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        iconCompatParcelizer.write.setContentDescription(setConstantBitrateSeekingAlwaysEnabled.write(iconCompatParcelizer.write.getContext(), i2));
        setConstantBitrateSeekingEnabled setconstantbitrateseekingenabled = (setConstantBitrateSeekingEnabled) setMatroskaExtractorFlags.read(525444929, -525444929, zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), new Object[]{this.write}, zab.IconCompatParcelizer());
        Calendar calendarAudioAttributesCompatParcelizer = getExtractor.AudioAttributesCompatParcelizer();
        setAdtsExtractorFlags setadtsextractorflags = calendarAudioAttributesCompatParcelizer.get(1) == i2 ? setconstantbitrateseekingenabled.AudioAttributesImplApi26Parcelizer : setconstantbitrateseekingenabled.AudioAttributesImplBaseParcelizer;
        Iterator<Long> it = ((DateSelector) setMatroskaExtractorFlags.read(-937857988, 937857990, zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), new Object[]{this.write}, zab.IconCompatParcelizer())).read().iterator();
        while (it.hasNext()) {
            calendarAudioAttributesCompatParcelizer.setTimeInMillis(it.next().longValue());
            if (calendarAudioAttributesCompatParcelizer.get(1) == i2) {
                setadtsextractorflags = setconstantbitrateseekingenabled.read;
            }
        }
        setadtsextractorflags.RemoteActionCompatParcelizer(iconCompatParcelizer.write);
        iconCompatParcelizer.write.setOnClickListener(AudioAttributesCompatParcelizer(i2));
    }

    private View.OnClickListener AudioAttributesCompatParcelizer(final int i) {
        return new View.OnClickListener() { // from class: o.DefaultExtractorsFactoryExternalSyntheticLambda1.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultExtractorsFactoryExternalSyntheticLambda1.this.write.RemoteActionCompatParcelizer(DefaultExtractorsFactoryExternalSyntheticLambda1.this.write.read().AudioAttributesCompatParcelizer(Month.AudioAttributesCompatParcelizer(i, DefaultExtractorsFactoryExternalSyntheticLambda1.this.write.write().IconCompatParcelizer)));
                Object[] objArr = {DefaultExtractorsFactoryExternalSyntheticLambda1.this.write, setMatroskaExtractorFlags.IconCompatParcelizer.DAY};
                setMatroskaExtractorFlags.read(-1894204853, 1894204857, zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), objArr, zab.IconCompatParcelizer());
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.write.read().MediaBrowserCompatCustomActionResultReceiver();
    }

    final int IconCompatParcelizer(int i) {
        return i - this.write.read().AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer;
    }

    private int read(int i) {
        return this.write.read().AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer + i;
    }
}
