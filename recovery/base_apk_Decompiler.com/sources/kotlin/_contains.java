package kotlin;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: loaded from: classes4.dex */
final class _contains extends Filter {
    private write AudioAttributesCompatParcelizer;

    interface write {
        Cursor AudioAttributesCompatParcelizer();

        CharSequence RemoteActionCompatParcelizer(Cursor cursor);

        Cursor read(CharSequence charSequence);

        void read(Cursor cursor);
    }

    _contains(write writeVar) {
        this.AudioAttributesCompatParcelizer = writeVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursor = this.AudioAttributesCompatParcelizer.read(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursor != null) {
            filterResults.count = cursor.getCount();
            filterResults.values = cursor;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        if (filterResults.values == null || filterResults.values == cursorAudioAttributesCompatParcelizer) {
            return;
        }
        this.AudioAttributesCompatParcelizer.read((Cursor) filterResults.values);
    }
}
