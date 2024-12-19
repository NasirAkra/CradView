# CardView in Android

CardView is a UI component in Android that provides a flexible and visually appealing way to display content with a card-like design. It supports Material Design features like rounded corners, shadows, and content padding.

## Features

1. **Rounded Corners:**
   - CardView allows creating views with customizable rounded corners.

2. **Elevation (Shadow):**
   - Provides a shadow effect to give depth to the UI elements.

3. **Content Padding:**
   - Easily set padding within the CardView to manage spacing.

4. **Compatibility:**
   - Works seamlessly with RecyclerView for lists and grids.

5. **Customization:**
   - Configure attributes like `cardCornerRadius`, `cardElevation`, and background color.

## Usage

### 1. Add Dependency
To use CardView in your project, include the following dependency in your `build.gradle` file:
```groovy
dependencies {
    implementation 'androidx.cardview:cardview:1.0.0'
}
```

### 2. XML Layout
Define a CardView in your layout XML file:
```xml
<androidx.cardview.widget.CardView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:cardCornerRadius="8dp"
    app:cardElevation="4dp"
    android:layout_margin="8dp">

    <!-- Content inside the CardView -->
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="16dp"
        android:text="This is a CardView"
        android:textSize="16sp" />
</androidx.cardview.widget.CardView>
```

### 3. Attributes
Some common attributes used in CardView:
- `app:cardCornerRadius` – Sets the corner radius of the card.
- `app:cardElevation` – Sets the shadow depth (elevation).
- `app:cardBackgroundColor` – Changes the background color of the card.
- `app:cardContentPadding` – Sets the padding inside the card.
- `app:cardUseCompatPadding` – Adds compatibility padding for older versions.

### 4. Using CardView with RecyclerView
CardView is often used as an item layout in RecyclerView. Example:
- Define a CardView in your `item_layout.xml` file.
- Inflate it in the `RecyclerView.Adapter` to create a list of cards.

## Example Code

### Java/Kotlin Code
```kotlin
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the CardView by ID
        val cardView = findViewById<CardView>(R.id.cardView)
        cardView.setOnClickListener {
            // Handle card click
        }
    }
}
```

## Best Practices

1. Use `cardUseCompatPadding` for consistent appearance across Android versions.
2. Avoid excessive `cardElevation` values, as high values may negatively affect performance.
3. Combine with RecyclerView for creating modern, efficient list-based UIs.

## References
- [Official Android Documentation](https://developer.android.com/jetpack/androidx/releases/cardview)
- [Material Design Guidelines](https://material.io/components/cards/)

---

**Happy Developing with CardView!**
