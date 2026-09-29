###### Class androidx.appcompat.app.ActionBar (androidx.appcompat.app.ActionBar)
.class public abstract Landroidx/appcompat/app/ActionBar;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/app/ActionBar$LayoutParams;,
        Landroidx/appcompat/app/ActionBar$read;,
        Landroidx/appcompat/app/ActionBar$write;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(F)V
    .registers 2

    const/4 p0, 0x0

    cmpl-float p0, p1, p0

    if-nez p0, :cond_6

    return-void

    .line 1022
    :cond_6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Setting a non-zero elevation is not supported in this action bar configuration."

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public abstract AudioAttributesCompatParcelizer(I)V
.end method

.method public AudioAttributesCompatParcelizer(Ljava/lang/CharSequence;)V
    .registers 2

    return-void
.end method

.method public AudioAttributesCompatParcelizer(Z)V
    .registers 2

    return-void
.end method

.method public AudioAttributesCompatParcelizer()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public AudioAttributesImplApi21Parcelizer()V
    .registers 2

    .line 967
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Hide on content scroll is not supported in this action bar configuration."

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public AudioAttributesImplBaseParcelizer()V
    .registers 1

    return-void
.end method

.method public IconCompatParcelizer()Landroid/content/Context;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public IconCompatParcelizer(Landroid/content/res/Configuration;)V
    .registers 2

    return-void
.end method

.method public IconCompatParcelizer(Z)V
    .registers 2

    return-void
.end method

.method public MediaBrowserCompatCustomActionResultReceiver()V
    .registers 1

    return-void
.end method

.method public MediaBrowserCompatItemReceiver()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public abstract RemoteActionCompatParcelizer(Z)V
.end method

.method public RemoteActionCompatParcelizer()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public RemoteActionCompatParcelizer(ILandroid/view/KeyEvent;)Z
    .registers 3

    const/4 p0, 0x0

    return p0
.end method

.method public abstract read()I
.end method

.method public read(Landroid/view/KeyEvent;)Z
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public write(Lo/onActivityResult$write;)Lo/onActivityResult;
    .registers 2

    const/4 p0, 0x0

    return-object p0
.end method

.method public abstract write(Ljava/lang/CharSequence;)V
.end method

.method public write(Z)V
    .registers 2

    return-void
.end method

.method public write()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.appcompat.app.ActionBar.LayoutParams (androidx.appcompat.app.ActionBar$LayoutParams)
.class public Landroidx/appcompat/app/ActionBar$LayoutParams;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ActionBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field public write:I


# direct methods
.method public constructor <init>(II)V
    .registers 3

    const/4 p1, -0x2

    .line 1385
    invoke-direct {p0, p1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const p1, 0x800013

    .line 1386
    iput p1, p0, Landroidx/appcompat/app/ActionBar$LayoutParams;->write:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    .line 1377
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 1374
    iput v0, p0, Landroidx/appcompat/app/ActionBar$LayoutParams;->write:I

    .line 1379
    sget-object v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ActionBarLayout:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 1380
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ActionBarLayout_android_layout_gravity:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Landroidx/appcompat/app/ActionBar$LayoutParams;->write:I

    .line 1381
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .registers 2

    .line 1405
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x0

    .line 1374
    iput p1, p0, Landroidx/appcompat/app/ActionBar$LayoutParams;->write:I

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/app/ActionBar$LayoutParams;)V
    .registers 3

    .line 1399
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 v0, 0x0

    .line 1374
    iput v0, p0, Landroidx/appcompat/app/ActionBar$LayoutParams;->write:I

    .line 1401
    iget p1, p1, Landroidx/appcompat/app/ActionBar$LayoutParams;->write:I

    iput p1, p0, Landroidx/appcompat/app/ActionBar$LayoutParams;->write:I

    return-void
.end method

###### Class androidx.appcompat.app.ActionBar.read (androidx.appcompat.app.ActionBar$read)
.class public interface abstract Landroidx/appcompat/app/ActionBar$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ActionBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "read"
.end annotation

###### Class androidx.appcompat.app.ActionBar.write (androidx.appcompat.app.ActionBar$write)
.class public abstract Landroidx/appcompat/app/ActionBar$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ActionBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "write"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract AudioAttributesCompatParcelizer()Landroid/view/View;
.end method

.method public abstract IconCompatParcelizer()Ljava/lang/CharSequence;
.end method

.method public abstract RemoteActionCompatParcelizer()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract write()Ljava/lang/CharSequence;
.end method
