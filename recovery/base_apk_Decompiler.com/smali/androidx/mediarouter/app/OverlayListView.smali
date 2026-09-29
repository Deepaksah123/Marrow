###### Class androidx.mediarouter.app.OverlayListView (androidx.mediarouter.app.OverlayListView)
.class public final Landroidx/mediarouter/app/OverlayListView;
.super Landroid/widget/ListView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/mediarouter/app/OverlayListView$write;
    }
.end annotation


# instance fields
.field private final read:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/mediarouter/app/OverlayListView$write;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 39
    invoke-direct {p0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 36
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/mediarouter/app/OverlayListView;->read:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 43
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/mediarouter/app/OverlayListView;->read:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 47
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/mediarouter/app/OverlayListView;->read:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 2

    .line 74
    iget-object p0, p0, Landroidx/mediarouter/app/OverlayListView;->read:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/mediarouter/app/OverlayListView$write;

    .line 75
    invoke-virtual {v0}, Landroidx/mediarouter/app/OverlayListView$write;->IconCompatParcelizer()V

    goto :goto_6

    :cond_16
    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/mediarouter/app/OverlayListView$write;)V
    .registers 2

    .line 56
    iget-object p0, p0, Landroidx/mediarouter/app/OverlayListView;->read:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .registers 6

    .line 81
    invoke-super {p0, p1}, Landroid/widget/ListView;->onDraw(Landroid/graphics/Canvas;)V

    .line 82
    iget-object v0, p0, Landroidx/mediarouter/app/OverlayListView;->read:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_34

    .line 83
    iget-object v0, p0, Landroidx/mediarouter/app/OverlayListView;->read:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 84
    :cond_11
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_34

    .line 85
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/mediarouter/app/OverlayListView$write;

    .line 86
    invoke-virtual {v1}, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesCompatParcelizer()Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v2

    if-eqz v2, :cond_26

    .line 88
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 90
    :cond_26
    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroidx/mediarouter/app/OverlayListView$write;->read(J)Z

    move-result v1

    if-nez v1, :cond_11

    .line 91
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_11

    :cond_34
    return-void
.end method

.method public final read()V
    .registers 5

    .line 63
    iget-object v0, p0, Landroidx/mediarouter/app/OverlayListView;->read:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/mediarouter/app/OverlayListView$write;

    .line 64
    invoke-virtual {v1}, Landroidx/mediarouter/app/OverlayListView$write;->RemoteActionCompatParcelizer()Z

    move-result v2

    if-nez v2, :cond_6

    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroidx/mediarouter/app/OverlayListView$write;->write(J)V

    goto :goto_6

    :cond_20
    return-void
.end method

###### Class androidx.mediarouter.app.OverlayListView.write (androidx.mediarouter.app.OverlayListView$write)
.class public final Landroidx/mediarouter/app/OverlayListView$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/mediarouter/app/OverlayListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "write"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/mediarouter/app/OverlayListView$write$RemoteActionCompatParcelizer;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Landroid/graphics/drawable/BitmapDrawable;

.field private AudioAttributesImplApi21Parcelizer:Z

.field private AudioAttributesImplApi26Parcelizer:Z

.field private AudioAttributesImplBaseParcelizer:Landroid/view/animation/Interpolator;

.field private IconCompatParcelizer:J

.field private MediaBrowserCompatCustomActionResultReceiver:Landroidx/mediarouter/app/OverlayListView$write$RemoteActionCompatParcelizer;

.field private MediaBrowserCompatItemReceiver:F

.field private MediaBrowserCompatMediaItem:Landroid/graphics/Rect;

.field private MediaDescriptionCompat:J

.field private MediaMetadataCompat:F

.field private RemoteActionCompatParcelizer:F

.field private read:I

.field private write:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/BitmapDrawable;Landroid/graphics/Rect;)V
    .registers 4

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 102
    iput v0, p0, Landroidx/mediarouter/app/OverlayListView$write;->RemoteActionCompatParcelizer:F

    .line 108
    iput v0, p0, Landroidx/mediarouter/app/OverlayListView$write;->MediaMetadataCompat:F

    .line 109
    iput v0, p0, Landroidx/mediarouter/app/OverlayListView$write;->MediaBrowserCompatItemReceiver:F

    .line 116
    iput-object p1, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesCompatParcelizer:Landroid/graphics/drawable/BitmapDrawable;

    .line 117
    iput-object p2, p0, Landroidx/mediarouter/app/OverlayListView$write;->MediaBrowserCompatMediaItem:Landroid/graphics/Rect;

    .line 118
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, p2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object p1, p0, Landroidx/mediarouter/app/OverlayListView$write;->write:Landroid/graphics/Rect;

    .line 119
    iget-object p1, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesCompatParcelizer:Landroid/graphics/drawable/BitmapDrawable;

    if-eqz p1, :cond_2a

    .line 120
    iget p2, p0, Landroidx/mediarouter/app/OverlayListView$write;->RemoteActionCompatParcelizer:F

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr p2, v0

    float-to-int p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 121
    iget-object p1, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesCompatParcelizer:Landroid/graphics/drawable/BitmapDrawable;

    iget-object p0, p0, Landroidx/mediarouter/app/OverlayListView$write;->write:Landroid/graphics/Rect;

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_2a
    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Landroid/graphics/drawable/BitmapDrawable;
    .registers 1

    .line 131
    iget-object p0, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesCompatParcelizer:Landroid/graphics/drawable/BitmapDrawable;

    return-object p0
.end method

.method public final AudioAttributesCompatParcelizer(J)Landroidx/mediarouter/app/OverlayListView$write;
    .registers 3

    .line 175
    iput-wide p1, p0, Landroidx/mediarouter/app/OverlayListView$write;->IconCompatParcelizer:J

    return-object p0
.end method

.method public final IconCompatParcelizer(I)Landroidx/mediarouter/app/OverlayListView$write;
    .registers 2

    .line 164
    iput p1, p0, Landroidx/mediarouter/app/OverlayListView$write;->read:I

    return-object p0
.end method

.method public final IconCompatParcelizer()V
    .registers 2

    const/4 v0, 0x1

    .line 215
    iput-boolean v0, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesImplApi21Parcelizer:Z

    .line 216
    iput-boolean v0, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesImplApi26Parcelizer:Z

    .line 217
    iget-object p0, p0, Landroidx/mediarouter/app/OverlayListView$write;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/mediarouter/app/OverlayListView$write$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_c

    .line 218
    invoke-interface {p0}, Landroidx/mediarouter/app/OverlayListView$write$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer()V

    :cond_c
    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/animation/Interpolator;)Landroidx/mediarouter/app/OverlayListView$write;
    .registers 2

    .line 186
    iput-object p1, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesImplBaseParcelizer:Landroid/view/animation/Interpolator;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()Z
    .registers 1

    .line 140
    iget-boolean p0, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesImplApi21Parcelizer:Z

    return p0
.end method

.method public final read()Landroidx/mediarouter/app/OverlayListView$write;
    .registers 2

    const/high16 v0, 0x3f800000    # 1.0f

    .line 152
    iput v0, p0, Landroidx/mediarouter/app/OverlayListView$write;->MediaMetadataCompat:F

    const/4 v0, 0x0

    .line 153
    iput v0, p0, Landroidx/mediarouter/app/OverlayListView$write;->MediaBrowserCompatItemReceiver:F

    return-object p0
.end method

.method public final read(Landroidx/mediarouter/app/OverlayListView$write$RemoteActionCompatParcelizer;)Landroidx/mediarouter/app/OverlayListView$write;
    .registers 2

    .line 197
    iput-object p1, p0, Landroidx/mediarouter/app/OverlayListView$write;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/mediarouter/app/OverlayListView$write$RemoteActionCompatParcelizer;

    return-object p0
.end method

.method public final read(J)Z
    .registers 7

    .line 228
    iget-boolean v0, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v0, :cond_6

    const/4 p0, 0x0

    return p0

    .line 231
    :cond_6
    iget-wide v0, p0, Landroidx/mediarouter/app/OverlayListView$write;->MediaDescriptionCompat:J

    sub-long/2addr p1, v0

    long-to-float p1, p1

    iget-wide v0, p0, Landroidx/mediarouter/app/OverlayListView$write;->IconCompatParcelizer:J

    long-to-float p2, v0

    div-float/2addr p1, p2

    const/high16 p2, 0x3f800000    # 1.0f

    .line 232
    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 233
    iget-boolean v1, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesImplApi21Parcelizer:Z

    if-eqz v1, :cond_1e

    move v0, p1

    .line 236
    :cond_1e
    iget-object p1, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesImplBaseParcelizer:Landroid/view/animation/Interpolator;

    if-nez p1, :cond_24

    move p1, v0

    goto :goto_28

    .line 237
    :cond_24
    invoke-interface {p1, v0}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p1

    .line 238
    :goto_28
    iget v1, p0, Landroidx/mediarouter/app/OverlayListView$write;->read:I

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    .line 239
    iget-object v2, p0, Landroidx/mediarouter/app/OverlayListView$write;->write:Landroid/graphics/Rect;

    iget-object v3, p0, Landroidx/mediarouter/app/OverlayListView$write;->MediaBrowserCompatMediaItem:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v1

    iput v3, v2, Landroid/graphics/Rect;->top:I

    .line 240
    iget-object v2, p0, Landroidx/mediarouter/app/OverlayListView$write;->write:Landroid/graphics/Rect;

    iget-object v3, p0, Landroidx/mediarouter/app/OverlayListView$write;->MediaBrowserCompatMediaItem:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v1

    iput v3, v2, Landroid/graphics/Rect;->bottom:I

    .line 241
    iget v1, p0, Landroidx/mediarouter/app/OverlayListView$write;->MediaMetadataCompat:F

    iget v2, p0, Landroidx/mediarouter/app/OverlayListView$write;->MediaBrowserCompatItemReceiver:F

    sub-float/2addr v2, v1

    mul-float/2addr v2, p1

    add-float/2addr v1, v2

    iput v1, p0, Landroidx/mediarouter/app/OverlayListView$write;->RemoteActionCompatParcelizer:F

    .line 242
    iget-object p1, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesCompatParcelizer:Landroid/graphics/drawable/BitmapDrawable;

    if-eqz p1, :cond_5e

    iget-object v2, p0, Landroidx/mediarouter/app/OverlayListView$write;->write:Landroid/graphics/Rect;

    if-eqz v2, :cond_5e

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 243
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 244
    iget-object p1, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesCompatParcelizer:Landroid/graphics/drawable/BitmapDrawable;

    iget-object v1, p0, Landroidx/mediarouter/app/OverlayListView$write;->write:Landroid/graphics/Rect;

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 246
    :cond_5e
    iget-boolean p1, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesImplApi21Parcelizer:Z

    const/4 v1, 0x1

    if-eqz p1, :cond_70

    cmpl-float p1, v0, p2

    if-ltz p1, :cond_70

    .line 247
    iput-boolean v1, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesImplApi26Parcelizer:Z

    .line 248
    iget-object p1, p0, Landroidx/mediarouter/app/OverlayListView$write;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/mediarouter/app/OverlayListView$write$RemoteActionCompatParcelizer;

    if-eqz p1, :cond_70

    .line 249
    invoke-interface {p1}, Landroidx/mediarouter/app/OverlayListView$write$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer()V

    .line 252
    :cond_70
    iget-boolean p0, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesImplApi26Parcelizer:Z

    xor-int/2addr p0, v1

    return p0
.end method

.method public final write(J)V
    .registers 3

    .line 207
    iput-wide p1, p0, Landroidx/mediarouter/app/OverlayListView$write;->MediaDescriptionCompat:J

    const/4 p1, 0x1

    .line 208
    iput-boolean p1, p0, Landroidx/mediarouter/app/OverlayListView$write;->AudioAttributesImplApi21Parcelizer:Z

    return-void
.end method

###### Class androidx.mediarouter.app.OverlayListView.write.RemoteActionCompatParcelizer (androidx.mediarouter.app.OverlayListView$write$RemoteActionCompatParcelizer)
.class public interface abstract Landroidx/mediarouter/app/OverlayListView$write$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/mediarouter/app/OverlayListView$write;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RemoteActionCompatParcelizer"
.end annotation


# virtual methods
.method public abstract RemoteActionCompatParcelizer()V
.end method
